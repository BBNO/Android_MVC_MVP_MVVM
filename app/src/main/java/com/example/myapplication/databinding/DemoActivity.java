package com.example.myapplication.databinding;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.R;
import com.example.myapplication.bean.Account;

public class DemoActivity extends AppCompatActivity {

    private ActivityDemoBinding binding;
    private Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo);

        account = new Account();
        account.setName("test");
        account.setLevel(1000);
        binding.setAccount(account);
        binding.setActivity(this);
    }

    public void onclick(View view) {
//        Toast.makeText(this, "点击了", Toast.LENGTH_SHORT);
        int level = account.getLevel();
        account.setLevel(level + 1);
//        binding.setAccount(account);
    }
}
