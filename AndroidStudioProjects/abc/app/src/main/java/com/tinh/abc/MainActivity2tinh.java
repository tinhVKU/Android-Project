package com.tinh.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2tinh extends AppCompatActivity {
    Button btn1,btntakephoto;
    ImageView imgdispphoto;
    private static final int CAMERA_REQUEST = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2tinh);
        imgdispphoto = (ImageView) this.findViewById(R.id.imgdispphoto);
        btntakephoto = (Button) findViewById(R.id.btntakephoto);
        btn1 =(Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btntakephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camaraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camaraIntent,CAMERA_REQUEST);
            }
        });
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode==CAMERA_REQUEST && resultCode== Activity.RESULT_OK){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imgdispphoto.setImageBitmap(photo);
        }
    }
}