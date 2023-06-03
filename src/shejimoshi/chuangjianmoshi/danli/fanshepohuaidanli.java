package shejimoshi.chuangjianmoshi.danli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Title: fanshepohuaidanli
 * @Package shejimoshi.chuangjianmoshi.danli
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/6/1 21:36
 */
public class fanshepohuaidanli {


    private static jingtaineibulei readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Think\\Desktop\\a.txt"));
        //第一个读取Singleton对象
        jingtaineibulei instance = (jingtaineibulei) ois.readObject();
        return instance;
    }
    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        jingtaineibulei instaRnce = jingtaineibulei.getInstance();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Think\\Desktop\\a.txt"));
        //将instance对象写出到文件中
//        oos.writeObject(instance);
    }
}
