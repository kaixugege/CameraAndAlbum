package com.xugege.my.mvp.mvp_one;

import java.lang.ref.WeakReference;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public class LoginPresenter {
    protected LoginMode mImodel;
    protected WeakReference<ILoginView> mViewRefrence;//弱引用

    public LoginPresenter(ILoginView loginView) {
        this.mImodel = new LoginMode();
        this.mViewRefrence = new WeakReference(loginView);
    }

    public void login() {
        if (mViewRefrence!=null){
            if (mImodel != null && mViewRefrence.get() != null) {
                ILoginView loginView = mViewRefrence.get();
                String name = loginView.getUserName();
                String passWord = loginView.getPassword();
                loginView = null;
                //此时LoginListener作为匿名内部类是持有外部类的引用的。
                mImodel.login(name, passWord, new LoginListener() {
                    @Override
                    public void onSeccess() {
                        if (mViewRefrence.get() != null) {
                            mViewRefrence.get().onLoginSeccess();
                        }
                    }

                    @Override
                    public void onFails() {
                        if (mViewRefrence.get() != null) {
                            if (mViewRefrence.get() != null) {
                                mViewRefrence.get().onLoginFails();
                            }
                        }
                    }
                });
            }
        }
    }

    /**
     * 为什么加这个函数？
     * 因为这个prsenter一直保持有activity的引用，所以在activity ondestory的时候调用这个来释放activity的引用来防止溢出
     */
    public void onDestory() {
        this.mViewRefrence = null;
    }
}
