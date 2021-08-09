package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class mon_an extends AppCompatActivity {
    private TextView tieude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);

       Bundle bundle = getIntent().getExtras();
       ArrayList<String> arrayList = bundle.getStringArrayList("stringarray");
        Bundle bundle2 = getIntent().getExtras();
        ArrayList<Integer> arrayanh = bundle2.getIntegerArrayList("intarray");
        Bundle bundle3 = getIntent().getExtras();
        ArrayList<String> chebien = bundle3.getStringArrayList("chebien");
        ListView listView = findViewById(R.id.list);

//       ArrayAdapter<String> items = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
//       listView.setAdapter(items);
       Bundle bundle1 = getIntent().getExtras();
       String title = bundle1.getString("string");
       tieude = findViewById(R.id.tieude);
       tieude.setText(title);
       tieude.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onBackPressed();
           }
       });
       ArrayList<food> list = new ArrayList<food>();
       for(int i = 0; i<arrayanh.size();i++){
           list.add(new food(arrayanh.get(i),arrayList.get(i)));
       }
       food_adaper foodAdaper = new food_adaper(this,R.layout.row_food,list);
       listView.setAdapter(foodAdaper);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent1 = new Intent(mon_an.this,che_bien.class);
               intent1.putExtra("tinh",chebien.get(position).toString());
               intent1.putExtra("title",arrayList.get(position).toString());
               startActivity(intent1);
           }
       });
    }
}