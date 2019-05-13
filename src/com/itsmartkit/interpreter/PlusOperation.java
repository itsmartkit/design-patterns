package com.itsmartkit.interpreter;

/**
 * 加法表达式
 */
public class PlusOperation extends NonTerminalExpression {
    public PlusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    @Override
    public int interpreter(Context context) {
        return e1.interpreter(context) + e2.interpreter(context);
    }
}
