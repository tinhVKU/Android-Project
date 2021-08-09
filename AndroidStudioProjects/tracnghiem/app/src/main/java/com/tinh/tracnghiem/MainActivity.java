package com.tinh.tracnghiem;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button khong,mot,hai,ba,bon,nam,sau,bay,tam,chin,cong,tru,nhan,chia,cham,xoa,reset,bang;
    private TextView input,kq;
    private String[] arr = new String[100];
    private ArrayList<Double> listNumber = new ArrayList<Double>();
    private ArrayList<String> listString = new ArrayList<String>();
    private int i;
//    private double ketqua;
    private String Tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inview();
        setEvent();
    }
    public void inview(){
        khong = findViewById(R.id.khong);
        mot = findViewById(R.id.mot);
        hai = findViewById(R.id.hai);
        ba = findViewById(R.id.ba);
        bon = findViewById(R.id.bon);
        nam = findViewById(R.id.nam);
        sau = findViewById(R.id.sau);
        bay = findViewById(R.id.bay);
        tam = findViewById(R.id.tam);
        chin= findViewById(R.id.chin);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        cham = findViewById(R.id.cham);
        xoa = findViewById(R.id.xoa);
        reset = findViewById(R.id.reset);
        bang = findViewById(R.id.bang);
        input = findViewById(R.id.input);
        kq = findViewById(R.id.kq);
    }
    public void setEvent(){
        khong.setOnClickListener(this);
        mot.setOnClickListener(this);
        hai.setOnClickListener(this);
        ba.setOnClickListener(this);
        bon.setOnClickListener(this);
        nam.setOnClickListener(this);
        sau.setOnClickListener(this);
        bay.setOnClickListener(this);
        tam.setOnClickListener(this);
        chin.setOnClickListener(this);
        cong.setOnClickListener(this);
        tru.setOnClickListener(this);
        nhan.setOnClickListener(this);
        chia.setOnClickListener(this);
        cham.setOnClickListener(this);
        xoa.setOnClickListener(this);
        reset.setOnClickListener(this);
        bang.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.khong:
                input.append(khong.getText());
                break;
            case R.id.mot:
                input.append(mot.getText());
                break;
            case R.id.hai:
                input.append(hai.getText());
                break;
            case R.id.ba:
                input.append(ba.getText());
                break;
            case R.id.bon:
                input.append(bon.getText());
                break;
            case R.id.nam:
                input.append(nam.getText());
                break;
            case R.id.sau:
                input.append(sau.getText());
                break;
            case R.id.bay:
                input.append(bay.getText());
                break;
            case R.id.tam:
                input.append(tam.getText());
                break;
            case R.id.chin:
                input.append(chin.getText());

                break;
            case R.id.cong:
                input.append(cong.getText());
                break;
            case R.id.tru:
                input.append(tru.getText());
                break;
            case R.id.nhan:
                input.append(nhan.getText());
                break;
            case R.id.chia:
                input.append(chia.getText());
                break;
            case R.id.cham:
                input.append(cham.getText());
                break;
            case R.id.xoa:
                input.setText(xoachuoi(input.getText().toString()));
                break;
            case R.id.reset:
                input.setText("");
                kq.setText("");
                listNumber.clear();
                listString.clear();
                break;
            case R.id.bang:
                addlistString(input.getText().toString());
                addlistNumber(input.getText().toString());
                if(listString.size()>=listNumber.size()){
                    kq.setText("Erorr !");
                }
                else if(listString.size()<1){
                    kq.setText(input.getText());
                }
                else{
                    DecimalFormat df = new DecimalFormat("###.##########");
                    double ketqua =0;
                    for(int i = 0;i<(listNumber.size()-1);i++){
                        switch(listString.get(i)){
                            case "+":
                                if(i==0){
                                    ketqua =   listNumber.get(i)+listNumber.get(i+1);
                                }
                                else{
                                    ketqua = ketqua + listNumber.get(i+1);
                                }
                                break;
                            case "-":
                                if(i==0){
                                    ketqua =   listNumber.get(i)-listNumber.get(i+1);
                                }
                                else{
                                    ketqua = ketqua - listNumber.get(i+1);
                                }
                                break;
                            case "*":
                                if(i==0){
                                    ketqua =   listNumber.get(i)*listNumber.get(i+1);
                                }
                                else{
                                    ketqua = ketqua * listNumber.get(i+1);
                                }
                                break;
                            case "/":
                                if(i==0){
                                    ketqua =   listNumber.get(i)/listNumber.get(i+1);
                                }
                                else{
                                    ketqua = ketqua / listNumber.get(i+1);
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    kq.setText(df.format(ketqua)+"");
                }

                break;
            default:
                break;
        }
    }
    public String xoachuoi(String chuoi){
        int dai = chuoi.length();
        String tem = chuoi.substring(0,dai-1);
        return tem;
    }
    //Phuong thuc lay phep toan
    public void addlistString(String input){
        char[] Array = input.toCharArray();
        for(int i = 0;i< Array.length;i++){
            switch(Array[i]){
                case '+':
                    listString.add(Array[i]+"");
                    break;
                case '-':
                    listString.add(Array[i]+"");
                    break;
                case '*':
                    listString.add(Array[i]+"");
                    break;
                case '/':
                    listString.add(Array[i]+"");
                    break;
                default:
                    break;
            }
        }
    }
    //Phuong thuc lay so
    //Co thu vien lay so san roi
    public void addlistNumber(String input){
        //lay ra chu so trong chuoi co cac phep toan VD:232656-56+5*65
        //thu vien va thuat toan cua ho minh chi viec dung
        Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            listNumber.add(Double.valueOf(matcher.group(1)));
        }
    }
}