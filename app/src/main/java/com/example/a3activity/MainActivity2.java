package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void backToArticle(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_left,R.anim.stay);
    }

    public void backToBeranda(View view) {
        Intent a = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_left,R.anim.stay);
    }
}