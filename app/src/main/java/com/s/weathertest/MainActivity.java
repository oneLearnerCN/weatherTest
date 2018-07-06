package com.s.weathertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.s.weathertest.db.Province;

import org.litepal.LitePal;

import java.security.Provider;
import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
