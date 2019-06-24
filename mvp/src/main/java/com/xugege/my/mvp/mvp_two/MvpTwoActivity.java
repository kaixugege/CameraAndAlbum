package com.xugege.my.mvp.mvp_two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xugege.my.mvp.R;

public class MvpTwoActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @Override
    protected void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initView() {
        mPresenter.testGetMpresenter();
        mPresenter.testDb();
        mPresenter.testRequestNetwork();
        mPresenter.testPreference();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mvp_two;
    }

    @Override
    public void testGetMview() {
        Log.d("print", "我是V层的引用");
    }

    @Override
    public void attachView(IBaseView mView) {

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvp_two);
//    }
}
