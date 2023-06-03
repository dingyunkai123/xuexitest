package shejimoshi.chuangjianmoshi.gongchang;

/**
 * @Title: Demo
 * @Package shejimoshi.chuangjianmoshi.gongchang
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/3 13:12
 */
public class Demo {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
