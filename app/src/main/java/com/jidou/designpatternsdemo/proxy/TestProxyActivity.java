package com.jidou.designpatternsdemo.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jidou.designpatternsdemo.R;
import com.jidou.designpatternsdemo.proxy.statical.UserManagerProxy;

/**
 * @author Lu He
 * 测试代理模式
 */
public class TestProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_proxy);
    }

    public void testStatical(View view) {
        UserManagerProxy userManagerProxy = new UserManagerProxy();
    }

    public void testDynamic(View view) {
    }
}
