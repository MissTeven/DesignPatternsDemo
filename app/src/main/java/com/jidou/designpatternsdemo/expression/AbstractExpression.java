package com.jidou.designpatternsdemo.expression;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/8 15:45
 * des     : 解释器模式下的解释器基类
 */
abstract class AbstractExpression {
    /**
     * 解释
     *
     * @return 方法
     */
    abstract int interpret();
}
