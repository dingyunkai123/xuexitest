package com.dyk.test.lambda.fun;

import java.util.function.Consumer;

/**
 * @Title: ConsumerAndThenTest
 * @Package com.dyk.test.lambda.fun
 * @Author: dingyunkai
 * @CreateTime: 2022/7/2 18:20
 */
public class ConsumerAndThenTest {


    public static void main(String[] args) {
        fun2(m -> {
            System.out.println(m.toLowerCase());
        }, m2 -> {
            System.out.println(m2.toUpperCase());
        });
    }


    public static void fun2(Consumer<String> c1, Consumer<String> c2){
        String str = "hello word";
//        c1.accept(str);//转小写
//        c2.accept(str);//转大写
        c1.andThen(c2).accept(str);
    }

}
