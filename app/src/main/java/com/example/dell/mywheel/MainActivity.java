package com.example.dell.mywheel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dell.mywheel.wheel.DataCreate;
import com.example.dell.mywheel.wheel.TimeAdapter;
import com.example.dell.mywheel.wheel.WheelView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    WheelView view1;
    WheelView view2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = (WheelView) findViewById(R.id.wv1);
        view2 = (WheelView) findViewById(R.id.wv2);
        initView();
    }

    private void initView() {
        final List<Integer> list1 = DataCreate.timeDate(1,50,1);
        TimeAdapter timeAdapter = new TimeAdapter<Integer>(list1,getString(R.string.min));
        view1.setAdapter(timeAdapter);
        view1.setOnItemSelectedListener(new WheelView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(MainActivity.this,""+list1.get(index),Toast.LENGTH_SHORT).show();
            }
        });
        final List<Integer> list2 = DataCreate.timeDate(1,100,2);
        TimeAdapter timeAdapter2 = new TimeAdapter<Integer>(list2,getString(R.string.sec));
        view2.setAdapter(timeAdapter2);
        view2.setOnItemSelectedListener(new WheelView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(MainActivity.this,""+list2.get(index),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
