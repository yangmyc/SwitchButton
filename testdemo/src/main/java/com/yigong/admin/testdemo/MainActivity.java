package com.yigong.admin.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwitchButton btn_switchbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//        ActivityManager manager= (ActivityManager) getSystemService(ACTIVITY_SERVICE);
//        int heap=manager.getMemoryClass();
//        System.out.println("heap:"+heap);
    }

    private void initView() {
        btn_switchbutton= (SwitchButton) findViewById(R.id.btn_switchbutton);
        btn_switchbutton.setHydropowerListener(hydropowerListener);
        btn_switchbutton.setSoftFloorListener(softFloorListener);
    }
    SwitchButton.HydropowerListener hydropowerListener=new SwitchButton.HydropowerListener() {
        @Override
        public void hydropower() {
            Toast.makeText(MainActivity.this,"关",Toast.LENGTH_SHORT).show();
        }
    };
    SwitchButton.SoftFloorListener softFloorListener=new SwitchButton.SoftFloorListener() {
        @Override
        public void softFloor() {
            Toast.makeText(MainActivity.this,"开",Toast.LENGTH_SHORT).show();
        }
    };
}
