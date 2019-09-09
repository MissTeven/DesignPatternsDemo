package com.jidou.designpatternsdemo.proxy;

import android.util.Log;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/9 15:36
 * des     : 用户操作实现类
 */
public class UserManagerImp implements UserManager {
    private static final String TAG = "UserManagerImp";

    @Override
    public void login() {
        System.out.println("用户登录");
    }

    @Override
    public void logout() {
        System.out.println("用户退出");
    }
}
