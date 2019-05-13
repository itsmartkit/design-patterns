package com.itsmartkit.interpreter;

/**
 * 减法表达式
 */
public class MinusOperation extends NonTerminalExpression {

    public MinusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int interpreter(Context context) {
        return e1.interpreter(context) - e2.interpreter(context);
    }
}
