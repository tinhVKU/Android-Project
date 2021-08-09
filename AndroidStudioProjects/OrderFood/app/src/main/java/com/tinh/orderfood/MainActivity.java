package com.tinh.orderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btn_mi, btn_bun,btn_com,btn_ca;
    private TextView gia_mi,sl_mi,gia_bun,sl_bun,gia_com,sl_com,gia_ca,sl_ca,tong;
    private  int mi =0,bun=0,com = 0,ca=0,tongtien= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inView();
        Onclick();

    }
    public void inView(){
        btn_mi = findViewById(R.id.ibbanhmi);
        btn_bun = findViewById(R.id.ibbun);
        btn_com = findViewById(R.id.ibcom);
        btn_ca = findViewById(R.id.ibca);
        gia_mi = findViewById(R.id.giabanhmi);
        sl_mi = findViewById(R.id.slbanhmi);
        gia_bun = findViewById(R.id.giabun);
        sl_bun = findViewById(R.id.slbun);
        gia_com = findViewById(R.id.giacom);
        sl_com = findViewById(R.id.slcom);
        gia_ca = findViewById(R.id.giaca);
        sl_ca = findViewById(R.id.slca);
        tong = findViewById(R.id.tvtongsl);
    }
    public void Onclick(){
        btn_mi.setOnClickListener(this);
        btn_bun.setOnClickListener(this);
        btn_com.setOnClickListener(this);
        btn_ca.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.ibbanhmi:
                mi++;
                String banhmi = "Số lượng: "+String.valueOf(mi);
                sl_mi.setText(banhmi);
                tongtien = tongtien + 15000;
                tong.setText(String.valueOf(tongtien)+"VND");
                break;
            case R.id.ibbun:
                bun++;
                String bunbo = "Số lượng: "+String.valueOf(bun);
                sl_bun.setText(bunbo);
                tongtien = tongtien + 25000;
                tong.setText(String.valueOf(tongtien)+"VND");
                break;
            case R.id.ibcom:
                com++;
                String comchien = "Số lượng: "+String.valueOf(com);
                sl_com.setText(comchien);
                tongtien = tongtien + 100000;
                tong.setText(String.valueOf(tongtien)+"VND");
                break;
            case R.id.ibca:
                ca++;
                String goica = "Số lượng: "+String.valueOf(ca);
                sl_ca.setText(goica);
                tongtien = tongtien + 150000;
                tong.setText(String.valueOf(tongtien)+"VND");
                break;
            case R.id.tvtongsl:

                break;
        }
    }
    public void ibbanhmi(View view){
        mi++;
        String banhmi = "Số lượng: "+String.valueOf(mi);
        sl_mi.setText(banhmi);
        tongtien = tongtien + 15000;
        tong.setText(String.valueOf(tongtien)+"VND");
    }
    public void ibbun(View view){
        bun++;
        String bunbo = "Số lượng: "+String.valueOf(bun);
        sl_bun.setText(bunbo);
        tongtien = tongtien + 25000;
        tong.setText(String.valueOf(tongtien)+"VND");
    }
    public void ibcom(View view){
        com++;
        String comchien = "Số lượng: "+String.valueOf(com);
        sl_com.setText(comchien);
        tongtien = tongtien + 100000;
        tong.setText(String.valueOf(tongtien)+"VND");
    }
    public void ibca(View view){
        ca++;
        String goica = "Số lượng: "+String.valueOf(ca);
        sl_ca.setText(goica);
        tongtien = tongtien + 150000;
        tong.setText(String.valueOf(tongtien)+"VND");
    }
    public void btn_huy(View view){
        huy();
    }
    public void btn_tinhtien(View view){
        if(!tong.getText().toString().equals("")){
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
            huy();
        }
    }
    public void huy(){
        mi =0;
        bun =0;
        com=0;
        ca =0;
        tongtien=0;
        sl_mi.setText("Số lượng: 0");
        sl_bun.setText("Số lượng: 0");
        sl_com.setText("Số lượng: 0");
        sl_ca.setText("Số lượng: 0");
        tong.setText("");
    }
}
