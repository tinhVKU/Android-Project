package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class vitamin extends AppCompatActivity {
    private TextView back,text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin);
        back = findViewById(R.id.tieude);
        text = findViewById(R.id.text1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("string");
        Bundle bundle1 = getIntent().getExtras();
        String content = bundle1.getString("noidung");
        back.setText(title);
        text.setText(content);
    }
}