package com.example.jun.myminemodule;

import android.app.Application;

import com.example.jun.baselibrary.IBaseApplication;
import com.example.jun.baselibrary.ServiceFactory;

public class MineApplication extends Application implements IBaseApplication {
    private static Application mineApplication;

    public static Application getInstance() {
        return mineApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializal(this);
    }

    @Override
    public void initializal(Application application) {
        this.mineApplication=  application;
        ServiceFactory.getInstance().setmMineService(new MineService());
    }
}
