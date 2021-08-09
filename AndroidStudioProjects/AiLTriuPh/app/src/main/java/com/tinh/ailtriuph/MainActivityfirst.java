package com.tinh.ailtriuph;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivityfirst extends AppCompatActivity implements View.OnClickListener {
    private Button btn,btn1,btn2;
    LinearLayout btns;
//    private MediaPlayer nhacnen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityfirst);
        invi();
    }
    public void invi(){
        btns = findViewById(R.id.btns);
        btn = findViewById(R.id.play);
        btn1 = findViewById(R.id.huongdan);
        btn2 = findViewById(R.id.exit);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        Animation move = AnimationUtils.loadAnimation(MainActivityfirst.this, R.anim.move);
        btns.startAnimation(move);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                Intent intent = new Intent(MainActivityfirst.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.huongdan:
                Intent intent1 =new Intent(MainActivityfirst.this,huongdan.class);
                startActivity(intent1);
                break;
            case R.id.exit:
                onBackPressed();
                break;

        }
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage("Bạn có thực sự muốn thoát trò chơi?").setCancelable(false)
                .setPositiveButton("Thoát", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivityfirst.super.onBackPressed();
                    }
                })
                .setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

}