package com.itsmartkit.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文环境
 */
public class Context {
    private Map<Expression, Integer> map = new HashMap<>();

    /**
     * 定义变量
     */
    public void add(Expression e, Integer value){
        map.put(e, value);
    }

    /**
     * 将变量转换成数字
     */
    public int lookup(Expression e){
        return map.get(e);
    }
}
