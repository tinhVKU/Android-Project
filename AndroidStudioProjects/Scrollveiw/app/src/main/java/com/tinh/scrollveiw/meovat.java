package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class meovat extends AppCompatActivity implements View.OnClickListener {
    private TextView back,trangtri,cat,sap,nenbiet,kinhdien,bimat,hay,giadinh,cuocsong;
    private LinearLayout ytrangtri,ycat,ysap,ynenbiet,ykinhdien,ybimat,yhay,ygiadinh,ycuocsong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meovat);
        inView();
        Onclick();
    }
    public void inView(){
        back = findViewById(R.id.tieude);
        trangtri = findViewById(R.id.trangtri);
        ytrangtri = findViewById(R.id.ytrangtri);
        cat = findViewById(R.id.cat);
        ycat = findViewById(R.id.ycat);
        sap = findViewById(R.id.sap);
        ysap = findViewById(R.id.ysap);
        nenbiet = findViewById(R.id.nenbiet);
        ynenbiet = findViewById(R.id.ynenbiet);
        kinhdien = findViewById(R.id.kinhdien);
        ykinhdien = findViewById(R.id.ykinhdien);
        bimat = findViewById(R.id.bimat);
        ybimat = findViewById(R.id.ybimat);
        hay = findViewById(R.id.hay);
        yhay = findViewById(R.id.yhay);
        giadinh = findViewById(R.id.giadinh);
        ygiadinh = findViewById(R.id.ygiadinh);
        cuocsong = findViewById(R.id.cuocsong);
        ycuocsong = findViewById(R.id.ycuocsong);

    }
    public void Onclick(){
        back.setOnClickListener(this);
        trangtri.setOnClickListener(this);
        ytrangtri.setOnClickListener(this);
        cat.setOnClickListener(this);
        ycat.setOnClickListener(this);
        sap.setOnClickListener(this);
        ysap.setOnClickListener(this);
        nenbiet.setOnClickListener(this);
        ynenbiet.setOnClickListener(this);
        kinhdien.setOnClickListener(this);
        ykinhdien.setOnClickListener(this);
        bimat.setOnClickListener(this);
        ybimat.setOnClickListener(this);
        hay.setOnClickListener(this);
        yhay.setOnClickListener(this);
        giadinh.setOnClickListener(this);
        ygiadinh.setOnClickListener(this);
        cuocsong.setOnClickListener(this);
        ycuocsong.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tieude:
                onBackPressed();
                break;
            case R.id.trangtri:
                String tinh = "https://massageishealthy.com/trang-tri-mon-an.html                                          ";
                Intent intent = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent.putExtra("link",tinh);
                startActivity(intent);
                break;
            case R.id.ytrangtri:
                String tinh1  = "https://www.youtube.com/watch?v=ATi5Qk8a2Gc";
                Intent intent1 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent1.putExtra("link",tinh1);
                startActivity(intent1);
                break;
            case R.id.cat:
                String tinh2 = "https://www.bachhoaxanh.com/kinh-nghiem-hay/nhung-meo-cat-got-rau-cu-qua-co-the-ban-chua-biet-1085168";
                Intent intent2 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent2.putExtra("link",tinh2);
                startActivity(intent2);
                break;
            case R.id.ycat:
                String tinh3 = "https://www.youtube.com/watch?v=EKMtK6ZHsOs";
                Intent intent3 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent3.putExtra("link",tinh3);
                startActivity(intent3);
                break;
            case R.id.sap:
                String tinh4 = "https://nhadepso.com/meo-vat/phong-bep-luon-gon-gang-va-ngan-nap-chi-voi-8-meo-vat-danh-rieng-cho-do-dung-nay";
                Intent intent4 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent4.putExtra("link",tinh4);
                startActivity(intent4);
                break;
            case R.id.ysap:
                String tinh5  = "https://www.youtube.com/watch?v=S58F0P5eyjc";
                Intent intent5  = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent5.putExtra("link",tinh5);
                startActivity(intent5);
                break;
            case R.id.nenbiet:
                String tinh6 = "https://minhhouseware.com.vn/kien-thuc/meo-vat-nha-bep.html";
                Intent intent6 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent6.putExtra("link",tinh6);
                startActivity(intent6);
                break;
            case R.id.ynenbiet:
                String tinh7  = "https://www.youtube.com/watch?v=CD8vh1pML3w";
                Intent intent7 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent7.putExtra("link",tinh7);
                startActivity(intent7);
                break;
            case R.id.kinhdien:
                String tinh8 = "https://bepnhathoc.com/bo-tui-15-meo-vat-vao-bep-kinh-dien-cho-cac-me-noi-tro/";
                Intent intent8= new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent8.putExtra("link",tinh8);
                startActivity(intent8);
                break;
            case R.id.ykinhdien:
                String tinh9 = "https://www.youtube.com/watch?v=Nv9QqadKK3g";
                Intent intent9= new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent9.putExtra("link",tinh9);
                startActivity(intent9);
                break;
            case R.id.bimat:
                String tinh10 = "https://bfccatering.com/9-meo-nha-bep-chi-dan-nha-nghe-moi-biet/";
                Intent intent10 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent10.putExtra("link",tinh10);
                startActivity(intent10);
                break;
            case R.id.ybimat:
                String tinh11  = "https://www.youtube.com/watch?v=mwHnNehu7eY";
                Intent intent11  = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent11.putExtra("link",tinh11);
                startActivity(intent11);
                break;
            case R.id.hay:
                String tinh12 = "https://toinayangi.vn/nhung-meo-hay-nha-bep-danh-cho-nguoi-noi-tro/";
                Intent intent12 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent12.putExtra("link",tinh12);
                startActivity(intent12);
                break;
            case R.id.yhay:
                String tinh13  = "https://www.youtube.com/watch?v=5l0QpjmodEc";
                Intent intent13  = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent13.putExtra("link",tinh13);
                startActivity(intent13);
                break;
            case R.id.giadinh:
                String tinh14 = "https://eva.vn/nha-dep/25-meo-vat-gia-dinh-ban-uoc-minh-biet-som-hon-c169a229416.html";
                Intent intent14 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent14.putExtra("link",tinh14);
                startActivity(intent14);
                break;
            case R.id.ygiadinh:
                String tinh15  = "https://www.youtube.com/watch?v=4qSMjMxUZeQ";
                Intent intent15  = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent15.putExtra("link",tinh15);
                startActivity(intent15);
                break;
            case R.id.cuocsong:
                String tinh16 = "https://vtc.vn/20-meo-vat-giup-don-gian-hoa-cuoc-song-cua-ban-ar582373.html";
                Intent intent16 = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent16.putExtra("link",tinh16);
                startActivity(intent16);
                break;
            case R.id.ycuocsong:
                String tinh17  = "https://www.youtube.com/watch?v=3VJmptzf3PI";
                Intent intent17  = new Intent(meovat.this,am_thuc_suc_khoe_con.class);
                intent17.putExtra("link",tinh17);
                startActivity(intent17);
                break;
        }
    }
}