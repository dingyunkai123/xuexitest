package shejimoshi.chuangjianmoshi.gongchang.factory_method;

import shejimoshi.chuangjianmoshi.gongchang.sinple_factory.SimpleCofferFactory;

/**
 * @Title: CoffeeStore
 * @Package shejimoshi.chuangjianmoshi.gongchang
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/3 13:10
 */
public class CoffeeStore {

    private CoffeeFatctory coffeeFatctory;

    public void setFatctory(CoffeeFatctory fatctory){
       this.coffeeFatctory = fatctory;
    }
    public Coffee orderCoffee(){
        Coffee coffee = coffeeFatctory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
