package com.dyk.test.lambda.fun;

import java.util.function.Consumer;

/**
 * @Title: ConsumerTest
 * @Package com.dyk.test.lambda.fun
 * @Author: dingyunkai
 * @CreateTime: 2022/7/2 18:14
 */
public class ConsumerTest {

    /**
     * Consumer 默认方法andThen
     * @param args
     */

    public static void main(String[] args) {

        fun1(m -> {
            System.out.println(m.length());
        });
    }

    public static void fun1(Consumer<String> stringConsumer){
        stringConsumer.accept("ABCDEF");
    }



}
