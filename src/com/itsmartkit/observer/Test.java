package com.itsmartkit.observer;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        WeChatServer weChatServer = new WeChatServer();
        WeiboServer weiboServer = new WeiboServer();

        Teacher teacher = new Teacher("张老师");
        Student student = new Student("张三");
        Student student1 = new Student("李四");

        weChatServer.registerObserver(teacher);
        weChatServer.registerObserver(student);
        weChatServer.registerObserver(student1);

        weiboServer.registerObserver(student);
        weiboServer.registerObserver(student1);

        weChatServer.setNews("美国向中国征收关税比例提高至25%");
        weiboServer.setNews("中美经贸谈判没有破裂");

        weChatServer.notifyObservers();
        weiboServer.notifyObservers();
        System.out.println("*******************************");
        weChatServer.removeObserver(student1);
        weChatServer.setNews("2019 iPhone XR 将新增两种颜色");
        weChatServer.notifyObservers();
    }
}
