package com.example.myapplication.mvvm;

import android.app.Application;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.myapplication.bean.Account;
import com.example.myapplication.callback.MCallback;

/**
 * @author : YJ
 * @date : 2019-12-24
 * desc :
 */
public class MVVMViewModel extends BaseObservable {

    private MVVMModel mvvmModel;
    private String result;
    private String userInput;

    public MVVMViewModel(Application application){
        mvvmModel = new MVVMModel();
    }

    public void getData(View view){
        mvvmModel.getAccountData(userInput, new MCallback() {
            @Override
            public void onSuccess(Account account) {
                String info = account.getName() + "|" + account.getLevel();
                setResult(info);
            }

            @Override
            public void onFailed() {
                setResult("账号信息获取失败");
            }
        });
    }

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(com.example.myapplication.BR.result);
    }

    @Bindable
    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
        notifyPropertyChanged(com.example.myapplication.BR.userInput);
    }
}
