package com.example.jun.baselibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class EmptyLoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {

    }

    @Override
    public Fragment newuserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
