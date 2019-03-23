package com.example.jun.myloginmodule;

import android.app.Application;

import com.example.jun.baselibrary.IBaseApplication;
import com.example.jun.baselibrary.ServiceFactory;

public class LoginApplication extends Application implements IBaseApplication {
    private static Application loginApplication;
    public static Application getInstance(){
        return loginApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        initializal(this);
    }

    @Override
    public void initializal(Application application) {
        this.loginApplication=  application;
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
