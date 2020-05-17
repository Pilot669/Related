package com.example.related;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

//        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));

        WebView webView = findViewById(R.id.webView);
        // включаем поддержку JavaScript
//        webView.setWebViewClient(new WebViewClient());
//        Uri data = getIntent().getData();
        webView.loadUrl("http://www.google.com");
    }
    private class MyWebViewClient extends WebViewClient {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        // Для старых устройств
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
//    public void onClick(View v) {
//      startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
    }
