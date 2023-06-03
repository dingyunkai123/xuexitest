package shejimoshi.shejisixiang.yilaidaozhuan.after;

/**
 * @Title: XijieYp
 * @Package shejimoshi
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/31 20:42
 */
public class XijieYp implements HardDisk{
    
    public void save(String data){
        System.out.println("使用细节硬盘存储数据为：" + data);
    }

    @Override
    public String get() {
        return "sjkfhak";
    }

}
