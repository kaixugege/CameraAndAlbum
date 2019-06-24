package com.xugege.my.mvp.mvp_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xugege.my.mvp.R;

public class MvpLoginActivity extends AppCompatActivity implements ILoginView {
    private EditText username;
    private EditText password;
    private Button mLogin;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_one);

        initView();
        setData();
    }

    private void setData() {
        mPresenter = new LoginPresenter(this);
    }

    private void initView() {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        mLogin = findViewById(R.id.login);
    }


    @Override
    public String getUserName() {
        return username.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void onLoginSeccess() {
        Toast.makeText(this,"登陆成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFails() {
        Toast.makeText(this,"登陆失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mPresenter.onDestory();
        this.mPresenter = null;
    }

    public void startLogin(View view) {
        mPresenter.login();
    }
}
