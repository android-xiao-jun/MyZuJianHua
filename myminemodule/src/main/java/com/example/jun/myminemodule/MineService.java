package com.example.jun.myminemodule;

import android.content.Context;
import android.content.Intent;

import com.example.jun.baselibrary.IMineService;

public class MineService implements IMineService {


    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.putExtra("userId",userId);
        context.startActivity(intent);
    }
}
