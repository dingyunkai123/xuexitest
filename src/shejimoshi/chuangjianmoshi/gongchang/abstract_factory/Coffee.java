package shejimoshi.chuangjianmoshi.gongchang.abstract_factory;

/**
 * @Title: Coffee
 * @Package shejimoshi.chuangjianmoshi.gongchang
 * @Author: dingyunkai
 * @Description 咖啡
 * @CreateTime: 2023/6/3 13:07
 */
public abstract class Coffee {

    public void addsugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }


    public abstract String getName();
}
