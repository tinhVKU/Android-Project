package com.tinh.cb2_insert_listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    SwipeRefreshLayout refresh;
    ListView lv;
    ArrayList<String> list = new ArrayList<String>();
   String []ten = {"Thịt bò nướng","Rau củ nướng","Mực nướng sa tế",
           "Thịt heo nướng","Nầm nướng chao","Tôm nướng","phan van tinh"};
    String []ten2 = {"Thịt","Rau","Mực",
            "heo","Nầm ","Tôm","tinh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       invi();
      listView();
    }
    public void invi(){
        refresh =findViewById(R.id.refresh);
        lv = findViewById(R.id.lv);
        refresh.setOnRefreshListener(this);
        Collections.addAll(list,ten);
        //mau refesh
        refresh.setColorSchemeColors(Color.BLACK,Color.RED,Color.GREEN,Color.YELLOW);
        // toa do
        refresh.setDistanceToTriggerSync(100);
        // kich thuoc
        refresh.setSize(SwipeRefreshLayout.LARGE);
    }
    @Override
    public void onRefresh() {
        //keo xuong sau 3s cap nhat du lieu
        CountDownTimer timer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                //Sau 3 giay dung xoay
                refresh.setRefreshing(false);
                list.clear();
                Collections.addAll(list,ten2);
                listView();
            }
        }.start();

    }
    public void listView(){
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(arrayAdapter);
    }
}   