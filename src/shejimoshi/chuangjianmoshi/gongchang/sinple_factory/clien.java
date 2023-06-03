package shejimoshi.chuangjianmoshi.gongchang.sinple_factory;

/**
 * @Title: clien
 * @Package shejimoshi.chuangjianmoshi.gongchang.sinple_factory
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/3 13:23
 */
public class clien {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
