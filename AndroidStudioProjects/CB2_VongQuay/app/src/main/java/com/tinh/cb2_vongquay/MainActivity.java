package com.tinh.cb2_vongquay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView vong;
//    TextView muiten;
    Button play;
    TextView kq;
    int from = 0;
    private ArrayList<vongquay> list ;

//    int []sodo ={ 0,18,36,54,72,90,108,126,144,162,180,198,216,234,252,270,288,306,324,342};
//    String []phanthuong ={ "come","catch","buy","bring","break","am/is/are","go","give","get",
//            "forget","fly","find","feed","eat","drive","drink","draw","do","cut","cost"};
    int []sovong ={360,720,1080,1440};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();

    }
    public void invi(){
        list = new ArrayList<vongquay>();
        list.add(new vongquay(0,"come"));
        list.add(new vongquay(18,"catch"));
        list.add(new vongquay(36,"buy"));
        list.add(new vongquay(54,"bring"));
        list.add(new vongquay(72,"break"));
        list.add(new vongquay(90,"am/is/are"));
        list.add(new vongquay(108,"go"));
        list.add(new vongquay(126,"give"));
        list.add(new vongquay(144,"get"));
        list.add(new vongquay(162,"forget"));
        list.add(new vongquay(180,"fly"));
        list.add(new vongquay(198,"find"));
        list.add(new vongquay(216,"feed"));
        list.add(new vongquay(234,"eat"));
        list.add(new vongquay(252,"drive"));
        list.add(new vongquay(270,"drink"));
        list.add(new vongquay(288,"draw"));
        list.add(new vongquay(306,"do"));
        list.add(new vongquay(324,"cut"));
        list.add(new vongquay(342,"cost"));

        vong = findViewById(R.id.vong);
        play = findViewById(R.id.play);
        kq = findViewById(R.id.kq);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kq.setText("");
                play.setVisibility(View.INVISIBLE);
                xuli();
            }
        });
    }
    public void xuli(){
        Random random = new Random();
        int so =random.nextInt(list.size());

        Random random1 = new Random();
        int i =random1.nextInt(sovong.length);
        int tam = sovong[i];

        int to= list.get(so).getGoc()+tam;
        String phanthuong = list.get(so).getPhanthuong();
        RotateAnimation animation = new RotateAnimation(from,to, Animation.RELATIVE_TO_SELF,0.5F,
                                                                Animation.RELATIVE_TO_SELF,0.5F);
        animation.setDuration(6000);
        animation.setInterpolator(new DecelerateInterpolator());
        animation.setFillAfter(true);
        vong.startAnimation(animation);
        from=to-tam;
        CountDownTimer countDownTimer= new CountDownTimer(6000,1000) {
            @Override
            //Moi 1 giay thi thuc hien cong viec gi do
            public void onTick(long millisUntilFinished) {

            }
            @Override
            //KHi hoan thanh thi thuc hien cong viec gi do
            public void onFinish() {
                kq.setText(phanthuong.toUpperCase());
                Animation fade = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);
                kq.startAnimation(fade);
                play.setVisibility(View.VISIBLE);
            }
        }.start();
    }
}