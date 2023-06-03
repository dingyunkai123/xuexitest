package com.dyk.test.lambda.proxy.jdk;

/**
 * @Title: SubjectImpl
 * @Package com.dyk.test.lambda.proxy.jdk
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/2/12 15:32
 */
public class SubjectImpl implements Subject{
    @Override
    public void getName(String name) {
        System.out.println("name, " + name);
    }
}
