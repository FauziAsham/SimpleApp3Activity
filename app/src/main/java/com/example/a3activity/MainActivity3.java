package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void nextToBiodata(View view) {
        Intent a = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

    public void backToBeranda(View view) {
        Intent a = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_left,R.anim.stay);
    }
}