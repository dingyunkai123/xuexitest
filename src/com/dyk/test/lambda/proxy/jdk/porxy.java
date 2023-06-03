package com.dyk.test.lambda.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title: porxy
 * @Package com.dyk.test.lambda.proxy.jdk
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/2/12 15:32
 */
public class porxy implements InvocationHandler {


    private Subject subject;


    //开始调度
    public  Object newproxy(Subject targetObject){
        subject=targetObject;
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,interfaces,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用前的业务");
        System.out.println("method"+method);
        Object result = method.invoke(subject, args);
        System.out.println("调用后的业务");
        return result;
    }
}
