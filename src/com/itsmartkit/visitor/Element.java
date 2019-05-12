package com.itsmartkit.visitor;

/**
 * 抽象元素
 */
public abstract class Element {

    protected String name;

    protected float salary;

    protected int workAges;

    public Element(String name, float salary, int workAges) {
        this.name = name;
        this.salary = salary;
        this.workAges = workAges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getWorkAges() {
        return workAges;
    }

    public void setWorkAges(int workAges) {
        this.workAges = workAges;
    }

    public abstract void acceppt(Visitor visitor);
}
