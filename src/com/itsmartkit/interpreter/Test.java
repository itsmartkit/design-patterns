package com.itsmartkit.interpreter;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");

        context.add(a,10);
        context.add(b,2);
        context.add(c,7);

        int result = new PlusOperation(new MinusOperation(a, b), c).interpreter(context);
        System.out.println(result);
    }
}
