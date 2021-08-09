package com.tinh.androidcoban;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnsimle,btnName,btnlayout;
    private Switch wifi;
    ToggleButton togobtn;
    private SeekBar sb1,sb2,sbHinh;
    private TextView kq1,kq2;
    private ImageView imgHinh;
    private ConstraintLayout frame;
    View custom_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invi();
        wifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(wifi.isChecked()==true){
                    Toast.makeText(MainActivity.this, "Wifi ON", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Wifi OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });


      togobtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(togobtn.isChecked()==true){
                Toast.makeText(MainActivity.this, "Wifi ON", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Wifi OFF", Toast.LENGTH_SHORT).show();
            }

        }
    });
      sb1.setMax(255);
      sb1.setProgress(150);
      int value = sb1.getProgress();
      kq1.setText(String.valueOf(value));
        int color = Color.argb(0-value,0,0,0);
        frame.setBackgroundColor(color);
      sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
          @Override
          public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
              kq1.setText(String.valueOf(progress));
              int color = Color.argb(0-progress,0,0,0);
              frame.setBackgroundColor(color);
          }

          @Override
          public void onStartTrackingTouch(SeekBar seekBar) {

          }

          @Override
          public void onStopTrackingTouch(SeekBar seekBar) {

          }
      });
      sb2.setMax(10);
      sb2.setProgress(5);
      int value2= sb2.getProgress()+10;
      kq2.setText(String.valueOf(value2));
    sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            progress+=10;
            kq2.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    sbHinh.setMax(9);
    int resID = getResources().getIdentifier("kem","drawable",getPackageName());
    imgHinh.setImageResource(resID);
    sbHinh.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if(progress==0)
            imgHinh.setImageResource(R.drawable.kem);
            if(progress==1)
                imgHinh.setImageResource(R.drawable.mtrung);
            if(progress==2)
                imgHinh.setImageResource(R.drawable.protein);
            if(progress==3)
                imgHinh.setImageResource(R.drawable.rua_rau);
            if(progress==4)
                imgHinh.setImageResource(R.drawable.sat);
            if(progress==5)
                imgHinh.setImageResource(R.drawable.vitmb);
            if(progress==6)
                imgHinh.setImageResource(R.drawable.vtma);
            if(progress==7)
                imgHinh.setImageResource(R.drawable.vtmc);
            if(progress==8)
                imgHinh.setImageResource(R.drawable.vtmd);
            if(progress==9)
                imgHinh.setImageResource(R.drawable.vtme);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });
    }
    public void invi(){
        btnsimle = findViewById(R.id.btnDialog1);
        btnsimle.setOnClickListener(this);
        btnName = findViewById(R.id.btnDialog2);
        btnName.setOnClickListener(this);
        btnlayout = findViewById(R.id.btnDialog3);
        btnlayout.setOnClickListener(this);
        wifi= findViewById(R.id.wifi);
        togobtn=findViewById(R.id.toggleButton);
        kq1 = findViewById(R.id.txtkq1);
        kq2 = findViewById(R.id.txtkq2);
        sb1 = findViewById(R.id.seekBar1);
        sb2 = findViewById(R.id.seekBar2);
        sbHinh = findViewById(R.id.seekBarHinh);
        imgHinh = findViewById(R.id.hinh);
        frame = findViewById(R.id.nen);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDialog1:

              dialogSimple();
                break;
            case R.id.btnDialog2:
                dialogCustomName();
                break;
            case R.id.btnDialog3:
                dialogCustomLayout();

        }
    }
    public void dialogSimple(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Thong Bao")
                .setMessage("Ban co muon thoat khong ?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Thoat", Toast.LENGTH_SHORT).show();
                        onBackPressed();
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Deo", Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }
    public void dialogCustomName(){

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Thong Bao")
                    .setMessage("Ban co muon thoat khong ?")
                    .setPositiveButton("Co", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Thoat", Toast.LENGTH_SHORT).show();
                            onBackPressed();
                        }
                    })
                    .setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Deo", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setCancelable(false);
            builder.create().show();

    }
    public void dialogCustomLayout(){
        //B1: Tao layout
        //B2: Lay duong dan Layout
        //B3: Gan vao Dialog
        LayoutInflater inflater = MainActivity.this.getLayoutInflater();
         custom_view = inflater.inflate(R.layout.activity_custom_layout,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Thong Bao")
                .setView(custom_view)
                .setPositiveButton("Dang nhap", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //KHoi tao doi tuong ket noi voi Layout khac
                        EditText tk= custom_view.findViewById(R.id.tk);
                        EditText mk = custom_view.findViewById(R.id.mk);
                        Toast.makeText(MainActivity.this, mk.getText(), Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Dang ki", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
//                .setCancelable(false);
        builder.create().show();
    }

}