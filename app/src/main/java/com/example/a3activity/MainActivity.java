package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void article(View view) {
        Intent a = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

    public void biodata(View view) {
        Intent a = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }
}