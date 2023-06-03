package com.dyk.test.lambda.proxy.jdk;

/**
 * @Title: main
 * @Package com.dyk.test.lambda.proxy.jdk
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/2/12 15:37
 */
public class mainPorxy {
    public static void main(String[] args) {
        Subject realSubject = new SubjectImpl();
        porxy invocationHandlerIml = new porxy();
        Subject subject = (Subject)invocationHandlerIml.newproxy(realSubject);
        subject.getName("帅哥");
    }
}
