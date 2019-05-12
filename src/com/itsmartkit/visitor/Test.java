package com.itsmartkit.visitor;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        StaffGroup staffGroup = new StaffGroup();

        staffGroup.addEmployee(new Staff("张三",11000,1));
        staffGroup.addEmployee(new Staff("李四",13000,2));
        staffGroup.addEmployee(new Staff("王五",12000,5));

        staffGroup.accept(new ConcreteVisitor());
    }
}
