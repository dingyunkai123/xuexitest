package com.dyk.test.lambda.domain;

/**
 * @Title: User
 * @Package com.dyk.test.lambda.domain
 * @Author: dingyunkai
 * @CreateTime: 2022/7/2 16:03
 */

public class User {

    private String name;

    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
