package shejimoshi.chuangjianmoshi.danli;

import java.util.Objects;

/**
 * @Title: lanhanshi
 * @Package shejimoshi.chuangjianmoshi.danli
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/31 21:50
 */
public class lanhanshi {

    private lanhanshi(){

    }

    private static volatile lanhanshi instance;


    public static  lanhanshi getInstance(){
        if (Objects.isNull(instance)){
            synchronized (lanhanshi.class){
                if (Objects.isNull(instance)){
                    instance = new lanhanshi();
                }
            }
            instance = new lanhanshi();
        }

        return instance;
    }
}
