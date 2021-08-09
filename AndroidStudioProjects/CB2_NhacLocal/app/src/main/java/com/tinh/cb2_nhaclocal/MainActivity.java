package com.tinh.cb2_nhaclocal;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button play;
    TextView title;
    RotateAnimation animation;
    CountDownTimer count;
    ImageView perious,next,pause,dia;
    MediaPlayer music;
    ArrayList<baihat> tinh = new ArrayList<baihat>();
//    int []baihat = {R.raw.cohenvoithanhxuan,
//                    R.raw.co_don_danh_cho_ai,
//                    R.raw.ep_duyen,
//                    R.raw.le_duyen_tinh,
//                    R.raw.tuong_phung,
//                    R.raw.the_luong,
//                    R.raw.song_gio};
    Boolean flag=false,co=false;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
    }
    public void invi(){
       perious = findViewById(R.id.perious);
       pause = findViewById(R.id.pause);
       next = findViewById(R.id.next);
       dia = findViewById(R.id.dia);
       title = findViewById(R.id.txt);
       play = findViewById(R.id.phatnhac);
        pause.setOnClickListener(this);
        perious.setOnClickListener(this);
        next.setOnClickListener(this);
        play.setOnClickListener(this);

        tinh.add(new baihat("Có Hẹn Với Thanh Xuân",R.raw.cohenvoithanhxuan));
        tinh.add(new baihat("Cô Đơn Dành Cho Ai", R.raw.co_don_danh_cho_ai));
        tinh.add(new baihat("Ép Duyên",R.raw.ep_duyen));
        tinh.add(new baihat("Lệ Duyên Tình",R.raw.le_duyen_tinh));
        tinh.add(new baihat("Tương Phùng",R.raw.tuong_phung));
        tinh.add(new baihat("Thê Lương ",R.raw.the_luong));
        tinh.add(new baihat("Sóng Gió",R.raw.song_gio));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.phatnhac:
                if(!flag){
                    pause.setImageResource(R.drawable.tiep);
                    hamdiaxoay();
                    play.setText("Tat Nhac");
                    choinhac();
                    flag=true;
                }else{
                    count.cancel();
                    animation.cancel();
                    play.setText("Choi Nhac");
                    music.stop();
                    flag = false;
                }
                break;
            case R.id.pause:
                if(flag){
                    if(!co){
                        pause.setImageResource(R.drawable.pause);
                        music.pause();
                        co =true;
                    }else{
                        pause.setImageResource(R.drawable.tiep);
                        music.start();
                        co=false;
                    }
                }

                break;
            case R.id.perious:
                if (flag){
                    if(i>0){
                        music.pause();
                        i=i-1;
                        choinhac();
                    }
                }

            case R.id.next:
                if (flag){
                    if(i<6){
                        music.pause();
                        i=i+1;
                        choinhac();
                    }
                }

        }
    }
    public void choinhac(){
//        music = MediaPlayer.create(MainActivity.this,baihat[i]);
        music = MediaPlayer.create(MainActivity.this,tinh.get(i).getDiachi());
        title.setText(tinh.get(i).getTen());
        music.start();
    }
    public void hamdiaxoay(){
         count = new CountDownTimer(150000000,5000) {
            @Override
            public void onTick(long millisUntilFinished) {
                animation = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5F,
                        Animation.RELATIVE_TO_SELF,0.5F);
                animation.setDuration(5000);
                animation.setInterpolator(new DecelerateInterpolator());
                animation.setFillAfter(true);
                dia.startAnimation(animation);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}