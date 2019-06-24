package com.xugege.my.mvp.mvp_two;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public interface IBasePresenter<V extends IBaseView> {
    /**
     * 绑定View
     * @param mView
     */
    void attachView(V mView);
}
