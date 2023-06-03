package shejimoshi.shejisixiang.yilaidaozhuan.after;

import shejimoshi.shejisixiang.yilaidaozhuan.befor.Computer;
import shejimoshi.shejisixiang.yilaidaozhuan.befor.InterCpu;
import shejimoshi.shejisixiang.yilaidaozhuan.befor.KingStonMemory;
import shejimoshi.shejisixiang.yilaidaozhuan.befor.XijieYp;

/**
 * @Title: demo
 * @Package shejimoshi.shejisixiang.yilaidaozhuan.after
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/31 20:59
 */
public class demo {
    public static void main(String[] args) {
        shejimoshi.shejisixiang.yilaidaozhuan.befor.Computer computer = new Computer();
        computer.setInterCpu(new InterCpu());
        computer.setXijieYp(new XijieYp());
        computer.setKingStonMemory(new KingStonMemory());
        computer.run();
    }
}
