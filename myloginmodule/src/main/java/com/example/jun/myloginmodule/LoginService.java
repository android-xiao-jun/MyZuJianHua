package com.example.jun.myloginmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.example.jun.baselibrary.ILoginService;

public class LoginService implements ILoginService {

    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public Fragment newuserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        InfoFragment infoFragment = new InfoFragment();
        infoFragment.setArguments(bundle);
        int commit = fragmentManager.beginTransaction().add(viewId, infoFragment).commit();
        Log.e("newuserInfoFragment","commit--"+commit);
        return infoFragment;
    }
}
