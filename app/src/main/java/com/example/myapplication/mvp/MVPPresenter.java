package com.example.myapplication.mvp;

import com.example.myapplication.bean.Account;
import com.example.myapplication.callback.MCallback;

/**
 * @author : YJ
 * @date : 2019-12-20
 * desc :
 */
public class MVPPresenter {
    private IMVPView imvpView;
    private MVPModel mvpModel;

    public MVPPresenter(IMVPView imvpView) {
        this.imvpView = imvpView;
        mvpModel = new MVPModel();
    }

    public void getAccountData(String accountName){
        mvpModel.getAccountData(accountName, new MCallback() {
            @Override
            public void onSuccess(Account account) {
                imvpView.showSuccessPage(account);
            }

            @Override
            public void onFailed() {
                imvpView.showFailedPage();
            }
        });
    }
}
