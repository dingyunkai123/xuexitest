package com.dyk.test.lambda.fun;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * @Title: SupplierTest
 * @Package com.dyk.test.lambda.fun
 * @Author: dingyunkai
 * @CreateTime: 2022/7/2 18:06
 * Supplier 接口使用
 */
public class SupplierTest {


    public static void main(String[] args) {
        fun1(() -> {
            int arr[] = {22,33,44};
            Arrays.sort(arr);
            return arr[arr.length -1];
        });
    }

    private static void fun1(Supplier<Integer> supplier){
        Integer integer = supplier.get();
        System.out.println(integer);
    }

}
