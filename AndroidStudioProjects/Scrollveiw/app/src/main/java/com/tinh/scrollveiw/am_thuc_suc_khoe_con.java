package com.tinh.scrollveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class am_thuc_suc_khoe_con extends AppCompatActivity {
    private WebView web;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_am_thuc_suc_khoe_con);
        web = findViewById(R.id.webview);
        title = findViewById(R.id.tieude);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
//        web.getSettings().setJavaScriptEnabled(true);
        Bundle bundle1 = getIntent().getExtras();
        String tam = bundle1.getString("link");
        web.loadUrl(tam);

    }
}