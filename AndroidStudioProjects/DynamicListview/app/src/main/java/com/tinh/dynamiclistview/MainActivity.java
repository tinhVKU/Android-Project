package com.tinh.dynamiclistview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView monan;
    EditText tim;
    //    ArrayList<String> stringArrayList3;
    ArrayList<hocsinh> danhsach;
        CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tim = findViewById(R.id.tim);
        monan = (ListView) findViewById(R.id.monan);
        timkiem();
        danhsach = new ArrayList<hocsinh>();
        danhsach.add(new hocsinh("Thịt bò nướng ",19,R.drawable.b11));
        danhsach.add(new hocsinh("Rau củ nướng",17,R.drawable.b12));
        danhsach.add(new hocsinh("Mực nướng sa tế",12,R.drawable.b13));
        danhsach.add(new hocsinh("Thịt heo nướng",7,R.drawable.c11));
        danhsach.add(new hocsinh("Nầm nướng chao",20,R.drawable.c12));
        danhsach.add(new hocsinh("Tôm nướng",49,R.drawable.c13));
        danhsach.add(new hocsinh("Thịt gà nướng ",51,R.drawable.ch11));
        danhsach.add(new hocsinh("Cá nướng giấy bạc",191,R.drawable.ch12));
        danhsach.add(new hocsinh("Mực nướng",76,R.drawable.ch13));
        danhsach.add(new hocsinh("Cà tím nướng mỡ hành",24,R.drawable.r11));
        danhsach.add(new hocsinh("Sườn nướng BBQ",20,R.drawable.r12));
        danhsach.add(new hocsinh("Tôm hùm nướng phô mai",75,R.drawable.r13));

        adapter = new CustomAdapter(MainActivity.this,danhsach);
        monan.setAdapter(adapter);
        monan.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                xoa(position);
                return false;
            }
        });
        monan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        danhsach.get(position).ten+"\n Gia: "+danhsach.get(position).tuoi+"k",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void xoa(int vtri){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Thong Bao")
                .setMessage("Ban thuc su muon xoa khong ?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        danhsach.remove(danhsach.get(vtri));
                        adapter.notifyDataSetChanged();
                        Toast.makeText(MainActivity.this, "Da xoa", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.create().show();
    }
//    public void timkiem(){
//        tim.addTextChangedListener(new TextWatcher() {
//            @Override
//            //truoc khi go
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            //Trong khi go
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            //sau khi go
//            public void afterTextChanged(Editable s) {
//                    adapter.getFilter().filter(s.toString());
//            }
//        });
//    }
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