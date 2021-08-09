package com.tinh.banphaohoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button click;
    EditText nhap;
    TextView so;
    TextView frame;
    Chronometer dongho;
    Timer timer;

    int []hinh = {
            R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,
            R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,
            R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,
            R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,
            R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,R.drawable.a25,
            R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,
            R.drawable.a31,R.drawable.a32,R.drawable.a33,R.drawable.a34,R.drawable.a35,
            R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,
            R.drawable.a41
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
    }
    public void invi(){
        click = findViewById(R.id.btndem);
        frame = findViewById(R.id.frame);
        nhap = findViewById(R.id.edtso);
        so = findViewById(R.id.txtso);
        dongho = findViewById(R.id.chrtime);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dem();
            }
        });
    }
    public void dem(){
        if(!nhap.getText().toString().equals("")){
            int gtri = Integer.parseInt(nhap.getText().toString().trim())*1000;
            if(gtri>0){
                CountDownTimer countDownTimer = new CountDownTimer(gtri,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        nhap.setVisibility(View.INVISIBLE);
                        click.setVisibility(View.INVISIBLE);
                        dongho.setVisibility(View.INVISIBLE);
                        so.setVisibility(View.VISIBLE);
                        so.setText(millisUntilFinished/1000+"");
                    }

                    @Override
                    public void onFinish() {
                        nhap.setText("");
//                        nhap.setVisibility(View.VISIBLE);
//                        click.setVisibility(View.VISIBLE);
//                        dongho.setVisibility(View.VISIBLE);
                        so.setVisibility(View.INVISIBLE);
                        hamTimer();

                    }
                }.start();
            }
        }

    }
    public void hamTimer(){
        timer = new Timer();

        // Cong viec, thoi gian bat dau cong viec, thoi gian goi lai cong viec
//
        MyTask myTask = new MyTask(frame,hinh);
        timer.scheduleAtFixedRate(myTask,100,150);
    }
    public class MyTask extends TimerTask {
        int i=0;
        TextView frame;
        int []hinh;                            

        public MyTask(TextView frame, int[] hinh) {
            this.frame = frame;
            this.hinh = hinh;
        }

        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    frame.setBackgroundResource(hinh[i]);
                    i+=1;
                    if(i>40){
                        timer.cancel();
                        frame.setBackground(null);
                        nhap.setVisibility(View.VISIBLE);
                        click.setVisibility(View.VISIBLE);
                        dongho.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
        //Dung timer dung ham: timer.cancel()
    }
}