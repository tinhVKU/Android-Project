package com.tinh.constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tvStart,tvEnd,tvResult;
    private Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvStart = findViewById(R.id.tvStart);
        tvEnd = findViewById(R.id.tvEnd);
        tvResult = findViewById(R.id.tvResult);
        btnRandom = findViewById(R.id.btnRandom);


        btnRandom.setOnClickListener(new View.OnClickListener() {
            Drawable background = btnRandom.getBackground();
            @Override
            public void onClick(View v) {
                if(!tvEnd.getText().toString().equals("") && !tvStart.getText().toString().equals("")){
                    int max = Integer.parseInt(tvEnd.getText().toString());
                    int min = Integer.parseInt(tvStart.getText().toString());
                    Random random =new Random();
                    int number = random.nextInt(max - min +1)+ min;
                    tvResult.setText(number + "");
                }
            }
        });
    }
}