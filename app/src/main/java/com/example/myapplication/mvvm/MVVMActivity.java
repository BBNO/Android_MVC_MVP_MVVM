package com.example.myapplication.mvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMvvmBinding;
/**
 * 点击按钮申请权限，可通过LiveData + ViewModel的方式实现
 */
public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvvmBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        MVVMViewModel mvvmViewModel = new MVVMViewModel(getApplication());
        binding.setViewModel(mvvmViewModel);
    }
}
