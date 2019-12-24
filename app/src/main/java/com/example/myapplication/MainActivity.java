package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.DemoActivity;
import com.example.myapplication.mvc.MVCActivity;
import com.example.myapplication.mvp.MVPActivity;
import com.example.myapplication.mvvm.MVVMActivity;
import com.example.myapplication.normal.NormalActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnNormal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NormalActivity.class));
            }
        });
        findViewById(R.id.btnMVC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MVCActivity.class));
            }
        });
        findViewById(R.id.btnMVP).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MVPActivity.class));
            }
        });
        findViewById(R.id.btnDatabinding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DemoActivity.class));
            }
        });
        findViewById(R.id.btnMVVM).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MVVMActivity.class));
            }
        });
    }
}
