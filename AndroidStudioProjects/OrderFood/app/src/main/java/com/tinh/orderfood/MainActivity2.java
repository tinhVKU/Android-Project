package com.tinh.orderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView back,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back = findViewById(R.id.quaylai);
        next = findViewById(R.id.xacnhan);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
//                startActivity(intent);
                CustomToast toast = new CustomToast(MainActivity2.this);
                toast.show();
                onBackPressed();
            }
        });
    }
}