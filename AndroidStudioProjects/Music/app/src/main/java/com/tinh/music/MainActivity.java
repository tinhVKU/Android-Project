package com.tinh.music;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<lvbaihat> list ;
    ListView baihat;
    CustomAdapter adapter;
    EditText tim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
        xoa();
        click();
    }
    public void invi(){
        baihat = findViewById(R.id.lvbaihat);
        tim = findViewById(R.id.tim);
        data tinh = new data();
        list = new ArrayList<lvbaihat>();
        Collections.addAll(list,tinh.mp3);
        adapter = new CustomAdapter(MainActivity.this,list);
        baihat.setAdapter(adapter);
        timkiem();
    }
    public void xoa(){
        baihat.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Thông Báo")
                        .setMessage("Bạn có thực sự muốn xóa ?")
                        .setPositiveButton("Xóa", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                list.remove(list.get(position));
                                adapter.notifyDataSetChanged();
                                Toast.makeText(MainActivity.this, "Đã xóa Khỏi danh sách", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Không", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setCancelable(false);
                builder.create().show();
                return false;
            }
        });
    }
    public void click(){
        baihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("vitri",position);
                startActivity(intent);
            }
        });
    }
    public void timkiem(){
        tim.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                adapter.filter(tim.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}