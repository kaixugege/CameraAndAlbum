package com.xugege.my.mvp.mvp_two;

import android.util.Log;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{
    @Override
    public void testGetMpresenter() {
        Log.d("print", "我是P层的引用");
        try {
            mView.testGetMview();

        }
        catch (Exception ex){
            Log.e(getClass().getSimpleName(),"testGetMpresenter  error:"+ex);
        }
    }

    @Override
    public void testDb() {
        mDataManager.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mDataManager.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mDataManager.testPreference();
    }
}
