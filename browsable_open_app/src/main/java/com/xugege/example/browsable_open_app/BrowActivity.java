package com.xugege.example.browsable_open_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class BrowActivity extends AppCompatActivity {
    private WebView webView;
    private String urlBase= "file:///android_asset/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brow);

        initView();

    }

    private void initView() {
        webView = findViewById(R.id.bop_webview);
        webView.getSettings().setJavaScriptEnabled(true);//设置支持 js
        webView.setWebChromeClient(new WebChromeClient() {});// 使用这个可以让alert可以弹出
        webView. loadUrl(urlBase+ "example.html");
    }
}
