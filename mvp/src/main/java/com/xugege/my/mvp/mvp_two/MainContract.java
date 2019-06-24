package com.xugege.my.mvp.mvp_two;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public interface MainContract {
    interface View extends IBaseView{
        void testGetMview();
    }

    interface Presenter extends IBasePresenter<View>{
        void testGetMpresenter();

        void testDb();

        void testRequestNetwork();

        void testPreference();
    }
}
