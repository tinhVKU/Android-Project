package com.tinh.cb3_speech_to_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech tts;
    Button speech;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        input = findViewById(R.id.input);
        speech = findViewById(R.id.speech);

        tts = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                // Neu ko co loi
                if (status != TextToSpeech.ERROR){
                    tts.setLanguage(Locale.UK);
                }else {
                    Toast.makeText(MainActivity.this, "Loi", Toast.LENGTH_SHORT).show();
                }
            }
        });
        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeech = input.getText().toString();
                tts.speak(toSpeech,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}