package shejimoshi.chuangjianmoshi.gongchang;

/**
 * @Title: CoffeeStore
 * @Package shejimoshi.chuangjianmoshi.gongchang
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/3 13:10
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        //声明coffee类型，根据不同类型创建不同的coffee
        Coffee coffee = null;
        if (type.equals("american")){
            coffee = new AmericanCoffee();
        }else if (type.equals("latte")){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有找到合适的类");
        }
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
