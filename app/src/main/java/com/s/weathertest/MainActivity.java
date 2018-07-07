package com.s.weathertest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.s.weathertest.util.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long nowTime = System.currentTimeMillis() / 1000;
        /*
        * 定时刷新
        * */
        String timeStamp = String.format("%010d", nowTime);
        int timeStampInt = Integer.parseInt(timeStamp);
        SharedPreferences sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE);
        String leastWeatherId = sharedPreferences.getString("leastWeatherId", null);
        String leastTimeStamp = sharedPreferences.getString("timeStamp", timeStamp);
        int leastTimeStampInt = Integer.parseInt(leastTimeStamp);
        boolean isFlesh = (timeStampInt - leastTimeStampInt) > 3600;
        if (leastWeatherId != null && !isFlesh) {
            Intent intent = new Intent(this, WeatherActivity.class);
            intent.putExtra("weather_id", leastWeatherId);
            startActivity(intent);
            finish();
        }

    }
}
