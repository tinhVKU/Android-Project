package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class amthuc_suckhoe extends AppCompatActivity implements View.OnClickListener {
    private TextView back;
    private TextView btn_giamcan,btn_beophi,btn_gia,btn_nho,btn_tieuduong,btn_soithan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amthuc_suckhoe);
        inview();
        Onclick();
    }
    public void inview(){
        back = findViewById(R.id.tieude);
        btn_giamcan = findViewById(R.id.giamcan);
        btn_beophi = findViewById(R.id.beophi);
        btn_gia = findViewById(R.id.gia);
        btn_nho = findViewById(R.id.nho);
        btn_tieuduong = findViewById(R.id.tieuduong);
        btn_soithan = findViewById(R.id.soithan);
    }
    public void Onclick(){
        back.setOnClickListener(this);
        btn_giamcan.setOnClickListener(this);
        btn_beophi.setOnClickListener(this);
        btn_gia.setOnClickListener(this);
        btn_nho.setOnClickListener(this);
        btn_tieuduong.setOnClickListener(this);
        btn_soithan.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tieude:
                onBackPressed();
                break;
            case R.id.giamcan:
                String tinh = "https://hellobacsi.com/an-uong-lanh-manh/che-do-an-kieng-va-quan-ly-can-nang/thuc-don-giam-can/";
                Intent intent = new Intent(amthuc_suckhoe.this,am_thuc_suc_khoe_con.class);
                intent.putExtra("link",tinh);
                startActivity(intent);
                break;
            case R.id.beophi:
                String tinh1  = "https://bvdklaocai.vn/dinh-duong-cho-nguoi-thua-can-beo-phi/";
                Intent intent1 = new Intent(amthuc_suckhoe.this,am_thuc_suc_khoe_con.class);
                intent1.putExtra("link",tinh1);
                startActivity(intent1);
                break;
            case R.id.gia:
                String tinh2 = "https://vnexpress.net/thuc-don-cho-nguoi-cao-tuoi-song-khoe-moi-ngay-4080536.html";
                Intent intent2 = new Intent(amthuc_suckhoe.this,am_thuc_suc_khoe_con.class);
                intent2.putExtra("link",tinh2);
                startActivity(intent2);
                break;
            case R.id.nho:
                String tinh3 = "https://hellobacsi.com/nuoi-day-con/tre-1-5-tuoi/dinh-duong-cho-tre-1-5-tuoi/thuc-don-hang-ngay-cho-tre/";
                Intent intent3 = new Intent(amthuc_suckhoe.this,am_thuc_suc_khoe_con.class);
                intent3.putExtra("link",tinh3);
                startActivity(intent3);
                break;
            case R.id.tieuduong:
                String tinh4 = "https://www.giaocolam.vn/mon-an-cho-nguoi-tieu-duong.html";
                Intent intent4 = new Intent(amthuc_suckhoe.this,am_thuc_suc_khoe_con.class);
                intent4.putExtra("link",tinh4);
                startActivity(intent4);
                break;
            case R.id.soithan:
                String tinh5  = "https://dantri.com.vn/suc-khoe/benh-soi-than-nen-an-gi-va-kieng-gi-ban-da-biet-hay-chua-20190401131131946.htm";
                Intent intent5  = new Intent(amthuc_suckhoe.this,am_thuc_suc_khoe_con.class);
                intent5.putExtra("link",tinh5);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}