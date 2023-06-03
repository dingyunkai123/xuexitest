package shejimoshi.chuangjianmoshi.danli;

/**
 * @Title: ehanshi
 * @Package shejimoshi.chuangjianmoshi.danli
 * @Author: dingyunkai
 * @Description 饿汉式和懒汉式的区别在于 饿汉是在类初始化的时候就创建了，而懒汉是在使用的时候才创建、
 * 饿汉成员变量
 * @CreateTime: 2023/5/31 21:37
 */
public class ehanshi {
    private ehanshi(){

    }

    private static ehanshi instance = new ehanshi();

    public static ehanshi getInstance(){
        return instance;
    }

}
