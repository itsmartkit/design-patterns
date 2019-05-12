package com.itsmartkit.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 */
public class StaffGroup {

    List<Staff> staffList = new ArrayList<>();

    public void addEmployee(Staff staff) {
        staffList.add(staff);
    }

    public void accept(Visitor visitor) {
        for (Staff staff : staffList) {
            visitor.visit(staff);
        }
    }
}
