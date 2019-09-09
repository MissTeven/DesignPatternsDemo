package com.jidou.designpatternsdemo.expression;

/**
 * @author : billlu
 * e-mail  : billlu@jidouauto.com
 * date    : 2019/9/8 15:52
 * des     :
 */
public class Calculator {
    private AbstractExpression mCurrentExpression;

    public int calculate(String input) {
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            switch (c) {
                case "+": {
                    AbstractExpression leftNumberExpression = mCurrentExpression;
                    AbstractExpression rightNumberExpression = new NumberExpression(Integer.valueOf(String.valueOf(input.charAt(++i))));
                    mCurrentExpression = new AdditionExpression(leftNumberExpression, rightNumberExpression);
                }
                break;
                case "-": {
                    AbstractExpression leftNumberExpression = mCurrentExpression;
                    AbstractExpression rightNumberExpression = new NumberExpression(Integer.valueOf(String.valueOf(input.charAt(++i))));
                    mCurrentExpression = new ReduceExpression(leftNumberExpression, rightNumberExpression);
                }
                break;
                default: {
                    mCurrentExpression = new NumberExpression(Integer.valueOf(String.valueOf(input.charAt(i))));
                }
                break;
            }
        }
        return mCurrentExpression.interpret();
    }
}
