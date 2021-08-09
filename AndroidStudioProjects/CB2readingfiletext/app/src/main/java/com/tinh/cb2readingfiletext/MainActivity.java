package com.tinh.cb2readingfiletext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    Button read;
    TextView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
    }
    public void invi(){
        read = findViewById(R.id.read);
        content = findViewById(R.id.content);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli();
            }
        });
    }
    public void xuli(){
        InputStream in = this.getResources().openRawResource(R.raw.nhac);
        InputStreamReader inreader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inreader);
        StringBuilder builder = new StringBuilder();
        String data;

            try {
                while ((data = bufferedReader.readLine())!=null) {
                    builder.append(data);
                }
                in.close();
                content.setText(builder);
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}