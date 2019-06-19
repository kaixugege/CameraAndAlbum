package com.xugege.example.browsable_open_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.nio.channels.NonWritableChannelException;

public class WebOpenAppActivity extends AppCompatActivity {

    private TextView webmsssage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_open_app);
        initView();
        init();
    }

    private void init() {
        Intent intent = getIntent();
        intent.getAction();
        webmsssage.setText("从web界面获取到参数 "+intent.getAction()+"\r\n"+intent.getScheme());
        webmsssage.append(intent.getDataString());
        webmsssage.append(intent.getType());
    }

    private void initView() {
        webmsssage = findViewById(R.id.webmsssage_boa);
    }

    public void openLocalHtml(View view) {
        startActivity(new Intent(this, BrowActivity.class));
    }
}
