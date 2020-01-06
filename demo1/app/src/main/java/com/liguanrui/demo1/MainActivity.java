package com.liguanrui.demo1;

import android.annotation.SuppressLint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;


public class MainActivity extends Activity {

    @SuppressLint("ShowToast")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为无标题
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);



        Button sd_button = (Button)findViewById(R.id.sd_button);
        Button wd_button = (Button)findViewById(R.id.wd_button);

        sd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SpeechDemo.class);
                startActivity(intent);
            }
        });

        wd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,WakeupDemo.class);
                startActivity(intent);
            }
        });
    }


}
