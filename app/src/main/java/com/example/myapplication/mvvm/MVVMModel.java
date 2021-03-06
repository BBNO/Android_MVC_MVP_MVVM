package com.example.myapplication.mvvm;

import com.example.myapplication.bean.Account;
import com.example.myapplication.callback.MCallback;

import java.util.Random;

/**
 * @author : YJ
 * @date : 2019-12-24
 * desc :
 */
public class MVVMModel {

    public void getAccountData(String accountName, MCallback mCallback){
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        if(isSuccess){
            Account account = new Account();
            account.setName(accountName);
            account.setLevel(100);
            mCallback.onSuccess(account);
        }else {
            mCallback.onFailed();
        }
    }
}
