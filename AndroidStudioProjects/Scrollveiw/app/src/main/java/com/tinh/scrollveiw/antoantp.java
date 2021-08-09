package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class antoantp extends AppCompatActivity implements View.OnClickListener {
    private TextView back,nhanbiet,tuoi,kho,ki,lamsach,sailam,vesinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an_toan_tp);
        inview();
        Onclick();
    }
    public void inview(){
        back = findViewById(R.id.tieude);
        nhanbiet = findViewById(R.id.nhanbiet);
        tuoi = findViewById(R.id.tuoi);
        kho = findViewById(R.id.kho);
        lamsach = findViewById(R.id.lamsach);
        sailam = findViewById(R.id.sailam);
        ki = findViewById(R.id.ki);
        vesinh = findViewById(R.id.vesinh);

    }
    public void Onclick(){
        back.setOnClickListener(this);
        nhanbiet.setOnClickListener(this);
        tuoi.setOnClickListener(this);
        kho.setOnClickListener(this);
        lamsach.setOnClickListener(this);
        sailam.setOnClickListener(this);
        ki.setOnClickListener(this);
        vesinh.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tieude:
                onBackPressed();
                break;
            case R.id.nhanbiet:
                Intent intent = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam = "https://tikibook.com/cach-nhan-biet-thuc-pham-ban-qua-han-su-dung-pr6635.html";
                intent.putExtra("link",tam);
                startActivity(intent);
                break;
            case R.id.tuoi:
                Intent intent1 = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam1 = "https://www.dienmayxanh.com/vao-bep/cach-bao-quan-thuc-pham-trong-tu-lanh-dung-cach-an-toan-luon-06289";
                intent1.putExtra("link",tam1);
                startActivity(intent1);
                break;
            case R.id.kho:
                Intent intent2 = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam2 = "https://vietnammoi.vn/bao-quan-dung-cach-cac-loai-thuc-pham-kho-trong-gia-dinh-41766.htm";
                intent2.putExtra("link",tam2);
                startActivity(intent2);
                break;
            case R.id.ki:
                Intent intent3 = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam3 = "https://amp.thaythuoccuaban.com/chedoan/monankynhau.html";
                intent3.putExtra("link",tam3);
                startActivity(intent3);
                break;
            case R.id.lamsach:
                Intent intent4 = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam4 = "https://blogdacsan.com/thuc-pham-sach-an-toan/kinh-nghiem-rua-rau-cu-qua-thuc-pham-sach-va-an-toan.html";
                intent4.putExtra("link",tam4);
                startActivity(intent4);
                break;
            case R.id.sailam:
                Intent intent5 = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam5 = "https://vietfoodshop.com/bai-viet/nhung-sai-lam-trong-che-bien-thuc-co-the-dan-den-ngo-doc/";
                intent5.putExtra("link",tam5);
                startActivity(intent5);
                break;
            case R.id.vesinh:
                Intent intent6 = new Intent(antoantp.this,am_thuc_suc_khoe_con.class);
                String tam6 = "https://atvstp.org.vn/tin-tuc/thuc-che-bien-nhu-nao-moi-dam-bao-toan-ve-sinh-thuc-pham";
                intent6.putExtra("link",tam6);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }
}