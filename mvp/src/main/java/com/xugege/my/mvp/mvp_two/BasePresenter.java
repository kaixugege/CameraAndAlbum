package com.xugege.my.mvp.mvp_two;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
public class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    //数据管理,负责M层的业务逻辑操作
    protected DataManager mDataManager;
    //V层的引用
    protected V mView;
    /**
     * 初始化DataManager
     */
    public BasePresenter(){
        //数据库
        AppDbHelper appDbHelper = new DbHelper();
        //共享参数存储
        AppPreferenceHelper appPreferenceHelper = new PreferenceHelper();
        //网络请求
        AppApiHelper appApiHelper = new ApiHelper();
        mDataManager = new DataManager(appDbHelper, appApiHelper, appPreferenceHelper);
    }

    @Override
    public void attachView(V mView) {

    }
}
