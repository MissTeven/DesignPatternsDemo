package com.jidou.designpatternsdemo.expression;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/8 15:47
 * des     : 操作符解释器基类
 */
abstract class AbstractOperationExpression extends AbstractExpression {
    AbstractExpression mLeftNumberExpression, mRightNumberExpression;

    AbstractOperationExpression(AbstractExpression leftNumberExpression, AbstractExpression rightNumberExpression) {
        mLeftNumberExpression = leftNumberExpression;
        mRightNumberExpression = rightNumberExpression;
    }
}
