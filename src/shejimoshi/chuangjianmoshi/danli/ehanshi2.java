package shejimoshi.chuangjianmoshi.danli;

/**
 * @Title: ehanshi2
 * @Package shejimoshi.chuangjianmoshi.danli
 * @Author: dingyunkai
 * @Description 饿汉式2 代码块
 * @CreateTime: 2023/5/31 21:44
 */
public class ehanshi2 {

    private ehanshi2(){

    }

    private static ehanshi2 instance = null;

    static {
        instance = new ehanshi2();
    }
    public static ehanshi2 getInstance(){
        return instance;
    }
}
