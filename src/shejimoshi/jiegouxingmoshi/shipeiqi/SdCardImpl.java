package shejimoshi.jiegouxingmoshi.shipeiqi;/** * @Title: SdCardImpl * @Package shejimoshi.jiegouxingmoshi.shipeiqi * @Author: dingyunkai * @Description * @CreateTime: 2023/6/4 18:52 */public class SdCardImpl implements SdCard{    @Override    public String read() {        String msg = "SdCard msg";        return msg;    }    @Override    public void writeSd(String msg) {        System.out.println("SdCard msg write:" + msg);    }}