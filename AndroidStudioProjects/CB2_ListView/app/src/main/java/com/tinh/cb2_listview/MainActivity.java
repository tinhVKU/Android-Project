package com.tinh.cb2_listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    DynamicListView monan;
//    ArrayList<String> stringArrayList3;
    ArrayList<hocsinh> danhsach;
//    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monan = (DynamicListView) findViewById(R.id.monan);
//        stringArrayList3 = new ArrayList<>();
//        stringArrayList3.add("Thịt heo nướng");
//        stringArrayList3.add("Lòng heo nướng");
//        stringArrayList3.add("Thịt bò nướng");
//        stringArrayList3.add("Tôm nướng");
//        stringArrayList3.add("Rau củ nướng");
//        stringArrayList3.add("Thịt gà nướng");
//        stringArrayList3.add("Sườn nướng");
//        stringArrayList3.add("Bạch tuộc nướng");
//        stringArrayList3.add("Cá nướng giấy bạc");
//        stringArrayList3.add("Mực nướng");
//        stringArrayList3.add("Tôm hùm nướng phô mai");
//        stringArrayList3.add("Mực nướng sa tế");
//        stringArrayList3.add("Bò cuộn nấm kim châm");
//        stringArrayList3.add("Cá nướng giấy bạc");
//        stringArrayList3.add("Sườn dê nướng tảng");
//        stringArrayList3.add("Cánh gà nướng sốt BBQ Hàn Quốc");
//        stringArrayList3.add("Sườn nướng BBQ");
//        stringArrayList3.add("Nầm nướng chao");
//        stringArrayList3.add("Cà tím nướng mỡ hành");

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

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,danhsach);
        monan.setAdapter(adapter);
        monan.setCheeseList(danhsach);

//        monan.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                xoa(position);
//                return false;
//            }
//        });
//        ArrayAdapter<String> item = new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1,stringArrayList3);
//        monan.setAdapter(item);
//        monan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String tam = stringArrayList3.get(position);
//                Toast.makeText(MainActivity.this, tam, Toast.LENGTH_SHORT).show();
//            }
//        });
        monan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        danhsach.get(position).ten+"\n Gia: "+danhsach.get(position).tuoi+"k",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
//    public void xoa(int vtri){
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
//                .setTitle("Thong Bao")
//                .setMessage("Ban thuc su muon xoa khong ?")
//                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        danhsach.remove(danhsach.get(vtri));
//                        adapter.notifyDataSetChanged();
//                        Toast.makeText(MainActivity.this, "Da xoa", Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//        builder.create().show();
//    }
}