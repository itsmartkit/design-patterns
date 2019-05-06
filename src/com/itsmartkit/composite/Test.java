package com.itsmartkit.composite;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory usrDir = new Directory("usr");
        Directory binDir = new Directory("bin");
        rootDir.add(usrDir);
        rootDir.add(binDir);

        usrDir.add(new Directory("doc"));
        usrDir.add(new File("1.txt"));
        binDir.add(new File("mysql.sh"));

        rootDir.display(1);
    }
}
