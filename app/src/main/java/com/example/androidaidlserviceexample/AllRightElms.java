package com.example.androidaidlserviceexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

public class AllRightElms  extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.allelms);


        Button hb = findViewById(R.id.hi_button);

        hb.setText("test2");


        algoTest();


    }



    public void algoTest(){


        Log.e("coan 1", "hi there");


    }

}
