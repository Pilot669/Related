package com.example.related;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends Activity {
    WebView wv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        WebView webView = findViewById(R.id.webView);
        // включаем поддержку JavaScript

        wv = (WebView)findViewById(R.id.webView);
        WebSettings settings = wv.getSettings();
        settings.setJavaScriptEnabled(true);
        wv.loadUrl("http://www.google.com");
        wv.setWebViewClient(new WebViewClient());
    }
    // пишем кнопку возврата
    @Override
    public  void onBackPressed(){
        if (wv.canGoBack()){
            wv.goBack();
        } else {
            super.onBackPressed();
        }
    }
}


