package com.zqf.mytimeline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private UnderLineLinearLayout underline_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        View v;
        for (int i = 0; i < 3; i++) {
            v = LayoutInflater.from(this).inflate(R.layout.item_vertical, underline_layout, false);
            if(i==2){
                v = LayoutInflater.from(this).inflate(R.layout.item_last, underline_layout, false);
            }
            underline_layout.addView(v);
        }

        //设置距离左边的宽度
        underline_layout.setLineMarginSide(UIHelper.dipToPx(this, 28));
    }

    private void initView() {
        underline_layout = (UnderLineLinearLayout) findViewById(R.id.underline_layout);
    }
}
