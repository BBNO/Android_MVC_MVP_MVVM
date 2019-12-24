package com.example.myapplication.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * @author : YJ
 * @date : 2019-12-17
 * desc :
 */
public class Account extends BaseObservable {
    private String name;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        notifyPropertyChanged(com.example.myapplication.BR.level);
    }
}
