package shejimoshi.shejisixiang.yilaidaozhuan.befor;

/**
 * @Title: demo
 * @Package shejimoshi
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/31 20:48
 */
public class demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setInterCpu(new InterCpu());
        computer.setXijieYp(new XijieYp());
        computer.setKingStonMemory(new KingStonMemory());
        computer.run();
    }
}
