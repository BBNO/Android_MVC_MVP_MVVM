package com.example.myapplication.callback;

import com.example.myapplication.bean.Account;

/**
 * @author : YJ
 * @date : 2019-12-17
 * desc :
 */
public interface MCallback {
    void onSuccess(Account account);
    void onFailed();
}
