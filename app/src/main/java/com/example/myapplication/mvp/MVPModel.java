package com.example.myapplication.mvp;

import com.example.myapplication.bean.Account;
import com.example.myapplication.callback.MCallback;

import java.util.Random;

/**
 * @author : YJ
 * @date : 2019-12-20
 * desc :
 */
public class MVPModel {

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
