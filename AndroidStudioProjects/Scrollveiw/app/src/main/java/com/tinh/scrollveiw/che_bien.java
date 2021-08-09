package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class che_bien extends AppCompatActivity {
    private TextView text,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_che_bien);
        text = findViewById(R.id.text1);
        back =findViewById(R.id.tieude);
        Bundle bundle = getIntent().getExtras();
        String cach = bundle.getString("tinh");
        Bundle bundle1 = getIntent().getExtras();
        String title = bundle1.getString("title");
        back.setText(title);
        text.setText(cach);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}