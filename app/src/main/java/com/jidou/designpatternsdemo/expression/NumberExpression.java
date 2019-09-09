package com.jidou.designpatternsdemo.expression;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/8 15:46
 * des     : 数字解释器
 */
public class NumberExpression extends AbstractExpression {
    private int mNumber;

    public NumberExpression(int number) {
        mNumber = number;
    }

    @Override
    int interpret() {
        return mNumber;
    }
}
