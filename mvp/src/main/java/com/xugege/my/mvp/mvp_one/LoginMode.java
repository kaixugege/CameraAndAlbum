package com.xugege.my.mvp.mvp_one;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public class LoginMode {

    //model 层

    private String mUserName = "xugege";
    private String mUserPassword = "123456";

    public void login(String username, String password, LoginListener listener){
        if (listener == null)return;
        if (username.equals(mUserName)&& password.equals(mUserPassword)){
            listener.onSeccess();
        }else{
            listener.onFails();
        }
    }
}
