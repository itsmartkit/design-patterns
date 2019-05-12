package com.itsmartkit.visitor;

/**
 * 具体访问者
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println("[" + element.getName() + "]当前薪资为：" + (element.getSalary() + element.getWorkAges() * 1500));
    }
}
