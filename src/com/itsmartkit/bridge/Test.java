package com.itsmartkit.bridge;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Post post = new SimplePost();
        // 1.信件平邮
        Letter letter = new Letter(post);
        letter.post();
        // 2.包裹平邮
        Parcel parcel = new Parcel(post);
        parcel.post();

        post = new MarkPost();
        // 3.信件挂号
        letter = new Letter(post);
        letter.post();
        // 4.包裹挂号
        parcel = new Parcel(post);
        parcel.post();
    }
}

