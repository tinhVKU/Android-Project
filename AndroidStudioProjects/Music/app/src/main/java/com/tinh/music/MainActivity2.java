package com.tinh.music;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    CircleImageView hinhanh;
    SeekBar sktime;
    ImageView perious,next,pause,back;
    TextView title,trinhbay,timeStart,timeEnd;
    MediaPlayer music;
    RunTimer runTimer;
    Boolean co = false,flag;
    int vitri,dem;
    RotateAnimation animation;
    ArrayList<lvbaihat> danhsach;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        invi();
        choinhac();
    }
    public void invi(){
        flag = false;
        perious = findViewById(R.id.perious);
        pause = findViewById(R.id.pause);
        next = findViewById(R.id.next);
        hinhanh = findViewById(R.id.dia);
        title = findViewById(R.id.tieude);
        trinhbay = findViewById(R.id.trinhbay);
        timeStart = findViewById(R.id.timestart);
        back = findViewById(R.id.back);
        timeEnd = findViewById(R.id.timeend);
        sktime = findViewById(R.id.sktime);

        pause.setOnClickListener(this);
        perious.setOnClickListener(this);
        next.setOnClickListener(this);
        back.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        vitri = bundle.getInt("vitri");

        data tinh = new data();
        danhsach = new ArrayList<lvbaihat>();
        Collections.addAll(danhsach,tinh.mp3);

        pause.setImageResource(R.drawable.tiep);
        hamdiaxoay();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pause:
                    if(!co){
                        animation.cancel();
                        pause.setImageResource(R.drawable.pause);
                        music.pause();
                        runTimer.cancel();
                        co =true;
                    }else{
                        hamdiaxoay();
                        pause.setImageResource(R.drawable.tiep);
                        music.start();
                        runTimer = new RunTimer();
                        timer.scheduleAtFixedRate(runTimer,0,1);
                        co=false;
                    }
                break;
            case R.id.perious:
                preMusic();
                break;
            case R.id.next:
                   nextMusic();
                break;
            case R.id.back:
                music.stop();
                onBackPressed();
                break;
        }
    }
    public void choinhac(){
        if (flag){
            music.stop();
            timer.cancel();
        }
       loadnhac();
        hinhanh.setImageResource(danhsach.get(vitri).getAnh());
        title.setText(danhsach.get(vitri).getTen());
        trinhbay.setText(danhsach.get(vitri).getCasi());
        flag=true;

    }
    //Ham nay de load nhac
    // Tranh truong hop nhac chua load kip thi da phat
    public void loadnhac(){
        music = MediaPlayer.create(MainActivity2.this, Uri.parse(danhsach.get(vitri).getUrl()));
        music.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                music.start();
                //Lay time bai hat
                int timemusic = music.getDuration();
                converTime(timeEnd,timemusic);
                sktime.setMax(timemusic);
                sktime.setProgress(0);
                sktime.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        music.seekTo(seekBar.getProgress());
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        music.seekTo(seekBar.getProgress());
                    }
                });
                timer = new Timer();
                 runTimer = new RunTimer();
                timer.scheduleAtFixedRate(runTimer,0,1);
            }
        });
    }
    public class RunTimer extends TimerTask{

        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    sktime.incrementProgressBy(1);
                    converTime(timeStart,sktime.getProgress());

                    baihathoanthanh();
                }
            });
        }
    }

    // Ham chuyen tu milisecond sang second
    public  void converTime(TextView tv, int time){
        NumberFormat f = new DecimalFormat("00");
        long timeMiniutes = TimeUnit.MILLISECONDS.toMinutes((long) time);
        long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(time)-TimeUnit.MINUTES.toSeconds(timeMiniutes);
        String resulf = f.format(timeMiniutes) + " : " + f.format(timeSeconds);
        tv.setText(resulf);
    }

    public void hamdiaxoay(){
                animation = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5F,
                        Animation.RELATIVE_TO_SELF,0.5F);
                //quay lien tuc va dieu
                animation.setRepeatCount(Animation.INFINITE);
                animation.setInterpolator(new LinearInterpolator());
                animation.setDuration(10000);
                animation.setFillAfter(true);
                hinhanh.startAnimation(animation);
    }

    public void baihathoanthanh(){
        if(timeStart.getText().toString().equals(timeEnd.getText().toString())){
            flag=true;
            runTimer.cancel();
            sktime.setProgress(0);
            nextMusic();
        }
    }

    public void nextMusic(){
        if(vitri==danhsach.size()-1){
            vitri=0;
            pause.setImageResource(R.drawable.tiep);
            choinhac();
        }else{
            pause.setImageResource(R.drawable.tiep);
            vitri++;
            choinhac();
        }
    }

    public void preMusic(){
        if(vitri==0){
            vitri=danhsach.size()-1;
            pause.setImageResource(R.drawable.tiep);
            choinhac();
        }else{
            pause.setImageResource(R.drawable.tiep);
            vitri--;
            choinhac();
        }
    }

    @Override
    public void onBackPressed() {
        music.stop();
        super.onBackPressed();
    }
}