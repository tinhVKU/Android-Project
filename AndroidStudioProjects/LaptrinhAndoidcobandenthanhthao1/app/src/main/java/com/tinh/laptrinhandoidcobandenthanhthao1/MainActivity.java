package com.tinh.laptrinhandoidcobandenthanhthao1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button count,start,pause,stop,btnTimer;
    private TextView kq;
    private ImageView imgHinh;
    Chronometer time;
    Boolean flag = false,tam = false;
    long timeWhenPause=0;
    Timer timer;
    int []hinh = {
            R.drawable.d1,
            R.drawable.d2,
            R.drawable.d3,
            R.drawable.d4,
            R.drawable.d5,
            R.drawable.d6,
    };
    int i=0;
//    int dem=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
    }
    public void invi(){
        count = findViewById(R.id.btncountdown);
        kq = findViewById(R.id.kq);
        count.setOnClickListener(this);
        time = findViewById(R.id.chno);
        start = findViewById(R.id.start);
        start.setOnClickListener(this);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        btnTimer = findViewById(R.id.btntimer);
        btnTimer.setOnClickListener(this);
        imgHinh = findViewById(R.id.imgHInh);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncountdown:
                countdown();
                break;
            case R.id.start:
                if(flag == false){
                    long currentTime = SystemClock.elapsedRealtime()+timeWhenPause;
                    time.setBase(currentTime);
                    time.start();
                    flag=true;
                }
                break;
            case R.id.stop:
                if(flag){
                    timeWhenPause = 0;
                    time.stop();
                    flag = false;
                }
                break;
            case R.id.pause:
                // timeWhenPause se la bien toan cuc
               if(flag){
                   time.stop();
                   timeWhenPause = time.getBase()-SystemClock.elapsedRealtime();
                   flag = false;
               }
                break;
            case R.id.btntimer:
                if(!tam){
                    Timer();
                    tam  = true;
                }
                else {
                    timer.cancel();
                    tam = false;
                }
                break;

        }
    }
    public void countdown(){
        //1 giay = 1000 milion giay
        CountDownTimer countDownTimer= new CountDownTimer(10000,1000) {
            @Override
            //Moi 1 giay thi thuc hien cong viec gi do
            public void onTick(long millisUntilFinished) {
               kq.setText("Thoi gian con lai "+ millisUntilFinished/1000);
               count.setVisibility(View.INVISIBLE);
               kq.setVisibility(View.VISIBLE);
            }
            @Override
            //KHi hoan thanh thi thuc hien cong viec gi do
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Xong", Toast.LENGTH_SHORT).show();
                kq.setVisibility(View.INVISIBLE);
                count.setVisibility(View.VISIBLE);
            }
        }.start();
    }
    public void Timer(){
        timer = new Timer();

        // Cong viec, thoi gian bat dau cong viec, thoi gian goi lai cong viec
//
        MyTask myTask = new MyTask(imgHinh,hinh);
        timer.scheduleAtFixedRate(myTask,100,200);
    }
    public class MyTask extends TimerTask {
        private ImageView imgHinh;
        int []hinh;
        public MyTask(ImageView imgHinh, int[] hinh) {
            this.imgHinh = imgHinh;
            this.hinh = hinh;
        }

        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    imgHinh.setImageResource(hinh[i]);
                    i+=1;
                    if(i>5){
                        i=0;
                    }
                }
            });
        }
    }
}