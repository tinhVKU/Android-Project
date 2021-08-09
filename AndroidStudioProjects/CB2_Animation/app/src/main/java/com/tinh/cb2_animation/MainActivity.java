package com.tinh.cb2_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView logo;
    Button zoom,clock,fade,blink,move,slide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khoitao();
    }
    public void khoitao(){
        logo = findViewById(R.id.logo);
        zoom = findViewById(R.id.zoom);
        clock = findViewById(R.id.clock);
        fade = findViewById(R.id.fade);
        blink = findViewById(R.id.blink);
        move = findViewById(R.id.move);
        slide = findViewById(R.id.slide);

        zoom.setOnClickListener(this);
        clock.setOnClickListener(this);
        fade.setOnClickListener(this);
        blink.setOnClickListener(this);
        move.setOnClickListener(this);
        slide.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.zoom:
                Animation zoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                logo.startAnimation(zoom);
                break;
            case R.id.clock:
                Animation clock = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotale);
                logo.startAnimation(clock);
                break;
            case R.id.fade:
                Animation fade = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);
                logo.startAnimation(fade);
                break;
            case R.id.blink:
                Animation blink = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink);
                logo.startAnimation(blink);
                break;
            case R.id.move:
                Animation move = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                logo.startAnimation(move);
                break;
            case R.id.slide:
                Animation slide = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide);
                logo.startAnimation(slide);
                break;

        }
    }
}