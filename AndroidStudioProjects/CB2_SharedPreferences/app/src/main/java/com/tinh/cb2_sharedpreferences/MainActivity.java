package com.tinh.cb2_sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, phone;
    Button save;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
        display();

    }
    public void invi(){
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }
    public void save(){
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name",name.getText().toString().trim());
        editor.putInt("phone",Integer.parseInt(phone.getText().toString().trim()));
        editor.commit();
    }
    public void display(){
        //Context.MODE_PRIVATE la ghi de len; ngoai ra thi con nhieu cai khac
        sp = getSharedPreferences("myShare", Context.MODE_PRIVATE);
        String ten = sp.getString("name","Khong co gia tri");
        int sdt = sp.getInt("phone",0);
        String kq = "Ho Ten: "+ten+"\nDien Thoai: "+sdt;
        Toast.makeText(this, kq, Toast.LENGTH_SHORT).show();
    }
}