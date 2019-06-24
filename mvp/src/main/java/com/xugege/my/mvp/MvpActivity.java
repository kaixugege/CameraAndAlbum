package com.xugege.my.mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xugege.my.mvp.mvp_one.MvpLoginActivity;
import com.xugege.my.mvp.mvp_two.MvpTwoActivity;

/**
 * 一句话总结:你代码逻辑有没有写在View中的,有就是MVC,没有就是MVP
 *
 * 什么是MVP
 * M:model
 * V:View
 * P:Presenter（
 *  主要分离视图逻辑和业务逻辑
 *  将写在activity中的各种业务分离出来，用interface的方式桥接起来
 * ）
 * MVP 把 Activity 中的 UI 逻辑抽象成 View 接口，把业务逻辑抽象成 Presenter 接口，Model 类还是原来的 Model。
 * MVP 的好处都有啥，谁说对了就给他 KIRA!!(<ゝω·)☆
 * 分离了视图逻辑和业务逻辑，降低了耦合
 * Activity 只处理生命周期的任务，代码变得更加简洁
 * 视图逻辑和业务逻辑分别抽象到了 View 和 Presenter 的接口中去，提高代码的可阅读性
 * Presenter 被抽象成接口，可以有多种具体的实现，所以方便进行单元测试
 * 把业务逻辑抽到 Presenter 中去，避免后台线程引用着 Activity 导致 Activity 的资源无法被系统回收从而引起内存泄露和 OOM
 避免 Activity 的内存泄露
 Android APP 发生 OOM 的最大原因就是出现内存泄露造成 APP 的内存不够用，而造成内存泄露的两大原因之一就是 Activity 泄露（Activity Leak）（另一个原因是 Bitmap 泄露（Bitmap Leak））。
 */
public class MvpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
    }

    public void mvpOne(View view) {
        startActivity(new Intent(this, MvpLoginActivity.class));
    }

    public void mvpTwo(View view) {
        startActivity(new Intent(this, MvpTwoActivity.class));
    }
}
