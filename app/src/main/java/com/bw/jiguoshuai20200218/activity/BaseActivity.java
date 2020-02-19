package com.bw.jiguoshuai20200218.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewID());
        getInitView();
        getData();
    }
    protected abstract int getViewID();
    protected abstract void getInitView();
    protected abstract void getData();
}
