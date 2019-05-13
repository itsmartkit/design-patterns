package com.itsmartkit.interpreter;

/**
 * 抽象表达式
 */
public interface Expression {
    int interpreter(Context context);
}
