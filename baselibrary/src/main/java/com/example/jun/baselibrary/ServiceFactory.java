package com.example.jun.baselibrary;

public class ServiceFactory {
    private static ServiceFactory serviceFactory = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return serviceFactory;
    }

    private ServiceFactory() {
    }

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getmLoginService() {
        if (mLoginService == null) {
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineService getmMineService() {
        if (mMineService == null) {
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }

    public void setmMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }
}
