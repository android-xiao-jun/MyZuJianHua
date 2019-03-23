package com.example.jun.myzujianhua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jun.baselibrary.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getmLoginService().launch(MainActivity.this, "");
//                Toast.makeText(MainActivity.this, "跳转login", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_mine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getmMineService().launch(MainActivity.this, 111);
//                Toast.makeText(MainActivity.this, "跳转mine", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_show_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                ServiceFactory.getInstance().getmLoginService().newuserInfoFragment(getSupportFragmentManager(), R.id.fragment_container, bundle);
//                Toast.makeText(MainActivity.this, "显示fragment", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
