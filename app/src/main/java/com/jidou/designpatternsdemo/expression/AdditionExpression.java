package com.jidou.designpatternsdemo.expression;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/8 15:49
 * des     : “+”操作符解释器
 */
public class AdditionExpression extends AbstractOperationExpression {
    public AdditionExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    int interpret() {
        return mLeftNumberExpression.interpret() + mRightNumberExpression.interpret();
    }
}
