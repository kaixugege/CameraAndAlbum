package com.xugege.cameraandalbum.weak;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xugege.cameraandalbum.R;

public class WeakActivity extends AppCompatActivity {

//    这里因为activity销毁之后，这里looper中还没销毁activity对象所以会出现oom错误
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weak);
    }
}
