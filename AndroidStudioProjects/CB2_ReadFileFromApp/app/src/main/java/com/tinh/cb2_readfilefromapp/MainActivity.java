package com.tinh.cb2_readfilefromapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button read,write;
    TextView content;
    EditText input;
    Boolean w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        input = findViewById(R.id.input);
        read = findViewById(R.id.read);
        write =findViewById(R.id.write);
        content =findViewById(R.id.content);
        read.setOnClickListener(this);
        write.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.read:
                xuli_read();
                break;
            case R.id.write:
                xuli_write();
                break;
        }
    }
    public void xuli_read(){
        try {
            String url = "/Bộ nhớ trong dùng chung/vd.txt";
            File file = new File(url);
            FileInputStream fInp = new FileInputStream(file);
            InputStreamReader in = new InputStreamReader(fInp);
            BufferedReader bufferedReader = new BufferedReader(in);
            StringBuilder builder = new StringBuilder();
            String data  ;
            while((data= bufferedReader.readLine())!=null){
                builder.append(data);
            }
            fInp.close();
            in.close();
            content.setText(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void xuli_write(){
        try {
            String url = "/Bộ nhớ trong dùng chung/vd.txt";
            File file = new File(url);
          w=  file.createNewFile();
            FileOutputStream fOut = new FileOutputStream(file);
            OutputStreamWriter myOUtWriter = new OutputStreamWriter(fOut,"UTF-8");
            myOUtWriter.append(input.getText());
            myOUtWriter.close();
            fOut.close();
            input.setText("");
            Toast.makeText(this, "Thanh cong", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}