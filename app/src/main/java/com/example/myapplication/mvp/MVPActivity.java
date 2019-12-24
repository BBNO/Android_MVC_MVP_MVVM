package com.example.myapplication.mvp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.bean.Account;

public class MVPActivity extends AppCompatActivity implements View.OnClickListener, IMVPView {

    private EditText et_account;
    private TextView tv_result;
    private MVPPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
        mvpPresenter = new MVPPresenter(this);
    }

    private void initView() {
        et_account = findViewById(R.id.et_account);
        tv_result = findViewById(R.id.tv_result);
        findViewById(R.id.btn_get_account).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        mvpPresenter.getAccountData(getUserInput());
    }

    @Override
    public String getUserInput() {
        return et_account.getText().toString();
    }

    @Override
    public void showSuccessPage(Account account) {
        tv_result.setText("MVP 用户账号：" + account.getName() + " | " + "用户等级：" + account.getLevel());
    }

    @Override
    public void showFailedPage() {
        tv_result.setText("MVP 账号信息获取失败");
    }
}
