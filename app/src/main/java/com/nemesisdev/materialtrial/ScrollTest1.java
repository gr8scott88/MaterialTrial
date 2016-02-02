package com.nemesisdev.materialtrial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by gr8sc on 12/24/2015.
 */
public class ScrollTest1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolltest1);
        ButterKnife.bind(this);
    }


}
