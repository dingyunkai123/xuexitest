package shejimoshi.shejisixiang.yilaidaozhuan.befor;

/**
 * @Title: Computer
 * @Package shejimoshi
 * @Author: dingyunkai
 * @Description 依赖倒转原则
 * @CreateTime: 2023/5/31 20:46
 */
public class Computer {

    private XijieYp xijieYp;
    private InterCpu interCpu;
    private KingStonMemory kingStonMemory;

    public XijieYp getXijieYp() {
        return xijieYp;
    }

    public void setXijieYp(XijieYp xijieYp) {
        this.xijieYp = xijieYp;
    }

    public InterCpu getInterCpu() {
        return interCpu;
    }

    public void setInterCpu(InterCpu interCpu) {
        this.interCpu = interCpu;
    }

    public KingStonMemory getKingStonMemory() {
        return kingStonMemory;
    }

    public void setKingStonMemory(KingStonMemory kingStonMemory) {
        this.kingStonMemory = kingStonMemory;
    }


    public void run(){
        System.out.println("运行计算机");
        String data = xijieYp.get();
        System.out.println("硬盘获取的数据为：" + data);

        interCpu.run();

        kingStonMemory.save();
    }
}
