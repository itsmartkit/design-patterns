package com.itsmartkit.visitor;

/**
 * 具体元素，雇员类
 */
public class Staff extends Element {

    public Staff(String name, float salary, int workAges) {
        super(name, salary, workAges);
    }

    @Override
    public void acceppt(Visitor visitor) {
        visitor.visit(this);
    }
}
