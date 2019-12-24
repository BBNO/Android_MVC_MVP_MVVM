package com.example.myapplication.mvp;

import com.example.myapplication.bean.Account;

/**
 * @author : YJ
 * @date : 2019-12-20
 * desc :
 */
public interface IMVPView {
    String getUserInput();
    void showSuccessPage(Account account);
    void showFailedPage();
}
