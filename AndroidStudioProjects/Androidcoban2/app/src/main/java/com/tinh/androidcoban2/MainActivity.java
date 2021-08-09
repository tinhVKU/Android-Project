package com.tinh.androidcoban2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button play;
    TextView diem;
    ImageView bai1,bai2,bai3;
    ArrayList<bai> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        diem = findViewById(R.id.diem);
        bai1 = findViewById(R.id.bai1);
        bai2 = findViewById(R.id.bai2);
        bai3 = findViewById(R.id.bai3);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taomang();
                diem.setText("");
                xuly();
            }
        });
    }
    public void Taomang(){
        list = new ArrayList<bai>();
        list.add(new bai(1,R.drawable.c1));
        list.add(new bai(2,R.drawable.c2));
        list.add(new bai(3,R.drawable.c3));
        list.add(new bai(4,R.drawable.c4));
        list.add(new bai(5,R.drawable.c5));
        list.add(new bai(6,R.drawable.c6));
        list.add(new bai(7,R.drawable.c7));
        list.add(new bai(8,R.drawable.c8));
        list.add(new bai(9,R.drawable.c9));
        list.add(new bai(0,R.drawable.c10));
        list.add(new bai(0,R.drawable.c11));
        list.add(new bai(0,R.drawable.c12));
        list.add(new bai(0,R.drawable.c13));

        list.add(new bai(1,R.drawable.r1));
        list.add(new bai(2,R.drawable.r2));
        list.add(new bai(3,R.drawable.r3));
        list.add(new bai(4,R.drawable.r4));
        list.add(new bai(5,R.drawable.r5));
        list.add(new bai(6,R.drawable.r6));
        list.add(new bai(7,R.drawable.r7));
        list.add(new bai(8,R.drawable.r8));
        list.add(new bai(9,R.drawable.r9));
        list.add(new bai(0,R.drawable.r10));
        list.add(new bai(0,R.drawable.r11));
        list.add(new bai(0,R.drawable.r12));
        list.add(new bai(0,R.drawable.r13));

        list.add(new bai(1,R.drawable.ch1));
        list.add(new bai(2,R.drawable.ch2));
        list.add(new bai(3,R.drawable.ch3));
        list.add(new bai(4,R.drawable.ch4));
        list.add(new bai(5,R.drawable.ch5));
        list.add(new bai(6,R.drawable.ch6));
        list.add(new bai(7,R.drawable.ch7));
        list.add(new bai(8,R.drawable.ch8));
        list.add(new bai(9,R.drawable.ch9));
        list.add(new bai(0,R.drawable.ch10));
        list.add(new bai(0,R.drawable.ch11));
        list.add(new bai(0,R.drawable.ch12));
        list.add(new bai(0,R.drawable.ch13));

        list.add(new bai(1,R.drawable.b1));
        list.add(new bai(2,R.drawable.b2));
        list.add(new bai(3,R.drawable.b3));
        list.add(new bai(4,R.drawable.b4));
        list.add(new bai(5,R.drawable.b5));
        list.add(new bai(6,R.drawable.b6));
        list.add(new bai(7,R.drawable.b7));
        list.add(new bai(8,R.drawable.b8));
        list.add(new bai(9,R.drawable.b9));
        list.add(new bai(0,R.drawable.b10));
        list.add(new bai(0,R.drawable.b11));
        list.add(new bai(0,R.drawable.b12));
        list.add(new bai(0,R.drawable.b13));
    }
    public void xuly(){
        Random random = new Random();
        int n =random.nextInt(list.size());
        int hinh1 = list.get(n).getBai();
        int so1 = list.get(n).getNumber();
        list.remove(list.get(n));

        Random random2 = new Random();
        int n2 =random2.nextInt(list.size());
        int hinh2 = list.get(n2).getBai();
        int so2 = list.get(n2).getNumber();
        list.remove(list.get(n2));

        Random random3 = new Random();
        int n3 =random3.nextInt(list.size());
        int hinh3 = list.get(n3).getBai();
        int so3 = list.get(n3).getNumber();
        list.remove(list.get(n3));

        int tong = (so1 +so2 +so3)%10;

            //1 giay = 1000 milion giay
            CountDownTimer countDownTimer= new CountDownTimer(1000,1000) {
                @Override
                //Moi 1 giay thi thuc hien cong viec gi do
                public void onTick(long millisUntilFinished) {
                }
                @Override
                //KHi hoan thanh thi thuc hien cong viec gi do
                public void onFinish() {
                    bai1.setImageResource(hinh1);
                    bai2.setImageResource(hinh2);
                    bai3.setImageResource(hinh3);
                    diem.setText(tong+" Diem");
                }
            }.start();
    }
}