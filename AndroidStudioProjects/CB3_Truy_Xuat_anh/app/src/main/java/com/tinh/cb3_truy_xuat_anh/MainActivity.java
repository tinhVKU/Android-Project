package com.tinh.cb3_truy_xuat_anh;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    VideoView video;
    ImageView imgPicture;
    Button picture,music,cenima;
    public final int RESULT_IMG = 1;
    public final int RESULT_MP3 = 2;
    public final int RESULT_VIDEO = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        picture = findViewById(R.id.picture);
        music = findViewById(R.id.music);
        cenima = findViewById(R.id.cinema);
        imgPicture = findViewById(R.id.imgpicture);
        video = findViewById(R.id.video);
        picture.setOnClickListener(this);
        music.setOnClickListener(this);
        cenima.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.picture:
                xuliAnh();
                break;
            case R.id.music:
                xuliNhac();
                break;
            case R.id.cinema:
                xuliPhim();
                break;
        }
    }
    public void xuliAnh(){
        Intent intentGetImg = new Intent();
//        CHON LAN LON NHIEU CAI
//        intentGetImg.setAction(Intent.ACTION_GET_CONTENT);
        //chon vao dung vi tri
        intentGetImg.setAction(Intent.ACTION_PICK);
        //Lay o the nho
        intentGetImg.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //Lay o bo nho trong
        intentGetImg.setData(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(intentGetImg,RESULT_IMG);
    }
    public void xuliNhac(){
        Intent intentGetMp3 = new Intent();
        intentGetMp3.setAction(Intent.ACTION_PICK);
        //Lay o the nho
        intentGetMp3.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //Lay o bo nho trong
        intentGetMp3.setData(MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(intentGetMp3,RESULT_MP3);
    }
    public void xuliPhim(){
        Intent intentGetVideo = new Intent();
        intentGetVideo.setAction(Intent.ACTION_PICK);
        //Lay o the nho
        intentGetVideo.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //Lay o bo nho trong
        intentGetVideo.setData(MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(intentGetVideo,RESULT_VIDEO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK && data!= null){
            if (requestCode == RESULT_IMG){
                try {
                    Uri imgdata = data.getData();
                    imgPicture.setImageURI(imgdata);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (requestCode == RESULT_MP3){
                try {
                    Uri mp3data = data.getData();
                    MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,mp3data);
                    mediaPlayer.start();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (requestCode == RESULT_VIDEO){
                try {
                    Uri videodata = data.getData();
                   video.setVideoURI(videodata);
                   video.start();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}