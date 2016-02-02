package com.nemesisdev.materialtrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.scrolltest_1)
    Button mButScrollTest;

    @Bind(R.id.scrolltest_generated)
    Button mButtonScrollTestGenb;

    @Bind(R.id.scrolltest_generated_2)
    Button mButtonScrollTestGen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.scrolltest_1) void launchScrollTest(){
        Intent intent = new Intent(this, ScrollTest1.class);
        startActivity(intent);
    }

    @OnClick(R.id.scrolltest_generated) void launchScrollTestGen(){
        Intent intent = new Intent(this, ScrollingActivity_Generated.class);
        startActivity(intent);
    }

    @OnClick(R.id.scrolltest_generated) void launchScrollTestGen2(){
        Intent intent = new Intent(this, ScrollTest_Gen2.class);
        startActivity(intent);
    }

}
