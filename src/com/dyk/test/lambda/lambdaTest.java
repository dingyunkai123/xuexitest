package com.dyk.test.lambda;

import com.dyk.test.lambda.domain.User;

import java.util.ArrayList;

/**
 * @Title: lambdaTest
 * @Package com.dyk.test.lambda
 * @Author: dingyunkai
 * @CreateTime: 2022/7/2 15:57
 * lambda 表达式是为了简化匿名表达式（匿名内部类）开发
 * 他的格式分为  () -> {}  三部分  (t1,t2)是参数  ->  {} 方法体
 * 接口一定只能有一个抽象方法
 */
public class lambdaTest {


    public static void main(String[] args) {
        /**
         * 无参写法
         */
        lambdaUser(new UserService() {
            @Override
            public void user() {
                System.out.println("匿名内部类写法----->user");
            }
        });

        lambdaUser(() -> {
            System.out.println("lambda写法---> user");
        });

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("dyk","12"));
        users.add(new User("dyk2","13"));


        lambdaStudent((String name,Integer age) -> {
            System.out.println(name + age);
            return name;
        }
        );


        /**
         * 他其实是对参数进行了一个实现
         */
        he(arr -> {
            int i = 0;
            for (Integer a:arr) {
                i = i + a;
            }
            System.out.println(i);
            return i;
        });

    }

    public static void lambdaUser(UserService userService){
        userService.user();
    }

    public static String lambdaStudent(StudentService studentService){
        return studentService.show("zhangsan",14);
    }

    public static Integer orderService(OrderService orderService){
        return orderService.show("zhangsan");
    }


    public static Integer he(arrService arrService){
        int [] arr ={1,2,3,4};
        return arrService.he(arr);
    }
}
