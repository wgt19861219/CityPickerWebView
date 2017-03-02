package com.example.wgt1986.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import me.leefeng.citypicker.CityPickerActivity;

public class MainActivity extends AppCompatActivity {
    private Button CityPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initListener();
    }

    /**
     * 声明控件
     */
    private void initUI() {
        CityPicker = (Button) findViewById(R.id.btn_CityPicker);
    }

    /**
     * 控件监听
     */
    private void initListener() {
        CityPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CityPickerActivity.class));
            }
        });
    }

}
