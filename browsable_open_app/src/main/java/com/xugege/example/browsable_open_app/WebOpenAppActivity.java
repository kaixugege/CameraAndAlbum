package com.xugege.example.browsable_open_app;

import android.content.Intent;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.lang.annotation.Retention;
import java.nio.channels.NonWritableChannelException;

public class WebOpenAppActivity extends AppCompatActivity {

    private TextView webmsssage;
    private WebView myGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(this.getClass().getSimpleName(), "onCrete");
        setContentView(R.layout.activity_web_open_app);
        initView();
        init();
    }

    private void init() {
        try {


            // 获取uri参数
            Intent intents = getIntent();
            String scheme = intents.getScheme();
            Uri uri = intents.getData();
            webmsssage.append("scheme " + scheme);
            webmsssage.append("\r\n" + "uri " + uri);

            switch (scheme) {
                case "xugege":
                    myGit.loadUrl("https://github.com/kaixugege");
                    break;
                default:
                    break;

            }


        } catch (Exception ex) {
            Log.e(this.getClass().getSimpleName(), "ex " + ex.getMessage());
        }
    }

    private void initView() {
        webmsssage = findViewById(R.id.webmsssage_boa);
        myGit = findViewById(R.id.webmsssage_mygit);
        myGit.getSettings().setJavaScriptEnabled(true);
        myGit.getSettings().setSupportZoom(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            myGit.getSettings().setMediaPlaybackRequiresUserGesture(true);
        }


        //设置防止web跳出到外部浏览器
        myGit.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                loadurlLocalMethod(view, url);
                return false;
            }
        });

    }

    public void loadurlLocalMethod(final WebView webView, final String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl(url);
            }
        });
    }


    public void openLocalHtml(View view) {
        startActivity(new Intent(this, BrowActivity.class));
    }
}
