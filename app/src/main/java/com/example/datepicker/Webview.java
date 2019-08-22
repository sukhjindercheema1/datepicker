package com.example.datepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Webview extends AppCompatActivity {

    Button btn_load;
    EditText edt_url;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actwebview);

        edt_url = findViewById(R.id.edt_url);
        btn_load = findViewById(R.id.btn_load);
        webView = findViewById(R.id.webview);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = edt_url.getText().toString();

                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });



    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
