package shejimoshi.shejisixiang.yilaidaozhuan.after;

/**
 * @Title: Computer
 * @Package shejimoshi.shejisixiang.yilaidaozhuan.after
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/31 20:57
 */
public class Computer {
    private Cpu cpu;
    private HardDisk hardDisk;
    private Nct nct;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Nct getNct() {
        return nct;
    }

    public void setNct(Nct nct) {
        this.nct = nct;
    }
    public void run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("硬盘获取的数据为：" + data);
        cpu.run();
        nct.save();
    }
}
