package com.itsmartkit.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理器
 */
public class ProxyHandler implements InvocationHandler {

    private Object object;

    public ProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在代理对象中拦截到方法：" + method.getName());
        System.out.println("执行事务...");
        Object returnObj = method.invoke(object, args);
        System.out.println("提交事务...");
        return returnObj;
    }
}
