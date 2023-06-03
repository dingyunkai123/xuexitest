package shejimoshi.chuangjianmoshi.danli;

/**
 * @Title: client
 * @Package shejimoshi.chuangjianmoshi.danli
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/31 21:42
 */
public class client {

    public static void main(String[] args) {
        ehanshi instance = ehanshi.getInstance();
        ehanshi instance1 = ehanshi.getInstance();
        System.out.println(instance1 == instance);
    }
}
