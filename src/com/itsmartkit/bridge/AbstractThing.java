package com.itsmartkit.bridge;

/**
 * 抽象事物，抽象化角色
 */
public abstract class AbstractThing {

    private Post post;

    public AbstractThing(Post post) {
        this.post = post;
    }

    public void post() {
        System.out.print("[" + this.getClass().getSimpleName()+"] ");
        post.post();
    }
}
