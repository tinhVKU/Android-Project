package com.tinh.order_restaurant;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView ban;
    private LinearLayout themban, datruoc, chuyenban;
    ArrayList<String> table ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inView();
        table.add("Ban 1");
        table.add("Ban 2");
        table.add("Ban 3");
        table.add("Ban 4");
        table.add("Ban 5");
        table.add("Ban 6");
        table.add("Ban 7");
        table.add("Ban 8");
        table.add("Ban 9");
        table.add("Ban 10");
        table.add("Ban 11");
        table.add("Ban 12");
        table.add("Ban 13");
        table.add("Ban 14");
        table.add("Ban 15");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                table);
        ban.setAdapter(adapter);
        themban.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
              table.add("Them t");
//              adapter.notifyDataSetChanged();
                ArrayAdapter<String>  adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                        table) {
                    @NonNull
                    @Override
                    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                    View view = super.getView(position, convertView, parent);
                    themban.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            table.add("Them t");

                            view.setBackgroundColor(getResources().getColor(
                                    android.R.color.holo_green_light
                            ));
                        }
                    });


                        return view;
                }
                };
                ban.setAdapter(adapter);
            }
        });
    }
    public void inView(){
        ban = findViewById(R.id.ban);
        themban = findViewById(R.id.themban);
        chuyenban = findViewById(R.id.chuyenban);
        datruoc = findViewById(R.id.dattruoc);
        table = new ArrayList<String>();
    }

//    public void Diglog(){
//        final AlertDialog.Builder  alertDiglog = new AlertDialog.Builder(getApplicationContext(),
//                R.style.dialogBox);
//
//    }
}