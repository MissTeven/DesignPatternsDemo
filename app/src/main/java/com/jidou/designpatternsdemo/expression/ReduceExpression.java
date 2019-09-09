package com.jidou.designpatternsdemo.expression;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/8 16:35
 * des     : "-"号解释器
 */
public class ReduceExpression extends AbstractOperationExpression {
    public ReduceExpression(AbstractExpression leftNumberExpression, AbstractExpression rightNumberExpression) {
        super(leftNumberExpression, rightNumberExpression);
    }

    @Override
    int interpret() {
        return mLeftNumberExpression.interpret() - mRightNumberExpression.interpret();
    }
}
