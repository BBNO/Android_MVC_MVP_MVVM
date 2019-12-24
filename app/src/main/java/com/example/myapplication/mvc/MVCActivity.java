package com.example.myapplication.mvc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.bean.Account;
import com.example.myapplication.callback.MCallback;

public class MVCActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_account;
    private TextView tv_result;
    private MVCModel mvcModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
        mvcModel = new MVCModel();
    }

    private void initView() {
        et_account = findViewById(R.id.et_account);
        tv_result = findViewById(R.id.tv_result);
        findViewById(R.id.btn_get_account).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        mvcModel.getAccountData(getUserInput(), new MCallback() {
            @Override
            public void onSuccess(Account account) {
                showSuccessPage(account);
            }

            @Override
            public void onFailed() {
                showFailedPage();
            }
        });
    }

    private String getUserInput(){
        return et_account.getText().toString();
    }

    private void showSuccessPage(Account account){
        tv_result.setText("用户账号：" + account.getName() + " | " + "用户等级：" + account.getLevel());
    }

    private void showFailedPage(){
        tv_result.setText("账号信息获取失败");
    }
}
