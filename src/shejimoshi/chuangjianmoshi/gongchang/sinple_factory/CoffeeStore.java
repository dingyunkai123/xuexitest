package shejimoshi.chuangjianmoshi.gongchang.sinple_factory;

import shejimoshi.chuangjianmoshi.gongchang.AmericanCoffee;
import shejimoshi.chuangjianmoshi.gongchang.LatteCoffee;

/**
 * @Title: CoffeeStore
 * @Package shejimoshi.chuangjianmoshi.gongchang
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/3 13:10
 */
public class CoffeeStore {
    public shejimoshi.chuangjianmoshi.gongchang.sinple_factory.Coffee orderCoffee(String type){
        SimpleCofferFactory simpleCofferFactory = new SimpleCofferFactory();
        Coffee coffee = simpleCofferFactory.createCoffee(type);
        coffee.addsugar();
        coffee.addMilk();
        return coffee;
    }
}
