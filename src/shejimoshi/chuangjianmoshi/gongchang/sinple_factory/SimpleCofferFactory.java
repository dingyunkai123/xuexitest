package shejimoshi.chuangjianmoshi.gongchang.sinple_factory;


/**
 * @Title: SimpleCofferFactory
 * @Package shejimoshi.chuangjianmoshi.gongchang.sinple_factory
 * @Author: dingyunkai
 * @Description 简单工厂，
 * @CreateTime: 2023/6/3 13:21
 */
public class SimpleCofferFactory {

    public Coffee createCoffee(String type){
        //声明coffee类型，根据不同类型创建不同的coffee
        shejimoshi.chuangjianmoshi.gongchang.sinple_factory.Coffee coffee = null;
        if (type.equals("american")){
            coffee = new AmericanCoffee();
        }else if (type.equals("latte")){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有找到合适的类");
        }
        return coffee;
    }
}
