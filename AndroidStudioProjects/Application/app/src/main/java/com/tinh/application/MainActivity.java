package com.tinh.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.style.IconMarginSpan;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    ArrayList<Integer> list ;
     Switch swt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout =(RelativeLayout) findViewById(R.id.layout) ;
       swt = (Switch) findViewById(R.id.switch2);
       swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked){
                   Toast.makeText(MainActivity.this,"Bật WIFI",Toast.LENGTH_SHORT);
               }
               else{
                   Toast.makeText(MainActivity.this,"Tắt WIFI",Toast.LENGTH_SHORT);
               }
           }
       });
       list = new ArrayList<>();
       list.add(R.drawable.hinhnen1);
        list.add(R.drawable.hinhnen2);
        list.add(R.drawable.hinhnen3);
        list.add(R.drawable.hinhnen4);
        list.add(R.drawable.hinhnen6);
        Random random = new Random();
        int so = random.nextInt(list.size());
        relativeLayout.setBackgroundResource(list.get(so));
    }
}