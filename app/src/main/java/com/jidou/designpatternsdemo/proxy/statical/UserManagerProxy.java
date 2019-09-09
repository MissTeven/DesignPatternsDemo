package com.jidou.designpatternsdemo.proxy.statical;

import com.jidou.designpatternsdemo.proxy.UserManager;
import com.jidou.designpatternsdemo.proxy.UserManagerImp;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/9 15:37
 * des     : 用户操作代理类
 */
public class UserManagerProxy implements UserManager {
    private UserManagerImp mUserManagerImp;

    public UserManagerProxy() {
        mUserManagerImp = new UserManagerImp();
    }

    @Override
    public void login() {
        mUserManagerImp.login();
    }

    @Override
    public void logout() {
        mUserManagerImp.logout();
    }
}
