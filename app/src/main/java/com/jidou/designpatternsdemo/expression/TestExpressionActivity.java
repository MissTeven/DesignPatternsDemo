package com.jidou.designpatternsdemo.expression;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.jidou.designpatternsdemo.R;

/**
 * @author Lu He
 * 测试解释器模式
 */
public class TestExpressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_expression);
    }


    @SuppressLint("SetTextI18n")
    public void calculate(View view) {
        String input = ((EditText) findViewById(R.id.et_input)).getText().toString();
        if (TextUtils.isEmpty(input)) {
            return;
        }
        ((TextView) findViewById(R.id.tv_result)).setText("计算结果：" + new Calculator().calculate(input));
    }
}
