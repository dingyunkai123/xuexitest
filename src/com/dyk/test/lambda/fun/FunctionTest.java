package com.dyk.test.lambda.fun;

import java.util.function.Function;

/**
 * @Title: FunctionTest
 * @Package com.dyk.test.lambda.fun
 * @Author: dingyunkai
 * @CreateTime: 2022/7/2 19:36
 *
 * 根据一个类型的数据得到另外一个类型的数据
 */
public class FunctionTest {


    public static void main(String[] args) {
        test(m -> {
            return Integer.valueOf(m);
        });
    }


    public static void test(Function<String,Integer> function){
        Integer apply = function.apply("666");
        System.out.println(apply);
    }


}
