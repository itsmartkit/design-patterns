package com.itsmartkit.interpreter;

/**
 * 终结符表达式
 */
public class TerminalExpression implements Expression {

    String variable;
    public TerminalExpression(String variable){
        this.variable = variable;
    }
    @Override
    public int interpreter(Context context) {
        return context.lookup(this);
    }
}
