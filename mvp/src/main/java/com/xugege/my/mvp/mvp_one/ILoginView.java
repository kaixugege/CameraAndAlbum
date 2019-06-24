package com.xugege.my.mvp.mvp_one;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public interface ILoginView {
    String getUserName();
    String getPassword();
    void onLoginSeccess();
    void onLoginFails();
}
