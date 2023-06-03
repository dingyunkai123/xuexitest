package com.dyk.test.lambda;

/**
 * 被该@FunctionalInterface修饰的接口只能有一个抽象方法，也就是只能有一个方法
 */
@FunctionalInterface
public interface UserService {


    public void user();

}
