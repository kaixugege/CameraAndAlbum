package com.xugege.my.mvp.mvp_two;

/**
 * @Author: KaixuGege
 * Time:           2019/6/24
 * ProjectName:    XuExample
 * ClassName:
 * Info:
 */
class DataManager implements AppDbHelper,AppApiHelper,AppPreferenceHelper{
    private AppDbHelper mAppDbHelper;
    private AppApiHelper mAppApiHelper;
    private AppPreferenceHelper mAppPreferenceHelper;

    public DataManager(AppDbHelper mAppDbHelper, AppApiHelper appApiHelper, AppPreferenceHelper appPreferenceHelper) {
        this.mAppDbHelper = mAppDbHelper;
        this.mAppApiHelper = appApiHelper;
        this.mAppPreferenceHelper = appPreferenceHelper;
    }


    @Override
    public void testDb() {
        mAppDbHelper.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mAppApiHelper.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mAppPreferenceHelper.testPreference();
    }
}
