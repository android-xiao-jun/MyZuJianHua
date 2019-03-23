package com.example.jun.myzujianhua;

import android.app.Application;

import com.example.jun.baselibrary.AppConfig;
import com.example.jun.baselibrary.IBaseApplication;

public class MyApplication extends Application implements IBaseApplication {
    private static MyApplication myApplication;

    public static MyApplication getInstance() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializal(this);
    }

    @Override
    public void initializal(Application application) {
        for (String APP : AppConfig.BASE_APPLICATION) {
            try {
                Class<?> aClass = Class.forName(APP);
                Object o = aClass.newInstance();
                if (o instanceof IBaseApplication) {
                    ((IBaseApplication) o).initializal(application);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
