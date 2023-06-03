package shejimoshi.chuangjianmoshi.danli;

import java.util.Objects;

/**
 * @Title: jingtaineibulei
 * @Package shejimoshi.chuangjianmoshi.danli
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/1 21:25
 */
public class jingtaineibulei {

    private jingtaineibulei(){

    }



    private static class SingletonHolder{
        //静态内部类，只会初始化一次静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中,
        // 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载,
        // 并初始化其静态属性。静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
        private static final jingtaineibulei instance =  new jingtaineibulei();
    }

    public static jingtaineibulei getInstance(){
        return SingletonHolder.instance;
    }

    public Object readResolve(){
        //当进行反序列化的时候，会自动调用该方法，讲该方法的返回值直接返回
        return SingletonHolder.instance;
    }
}
