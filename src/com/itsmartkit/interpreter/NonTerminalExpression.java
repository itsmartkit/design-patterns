package com.itsmartkit.interpreter;

/**
 * 抽象非终结符表达式
 */
public abstract class NonTerminalExpression implements Expression {
    protected Expression e1,e2;

    public NonTerminalExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
}
