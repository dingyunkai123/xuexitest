package shejimoshi.jiegouxingmoshi.shipeiqi.object_adapter;/** * @Title: Comuter * @Package shejimoshi.jiegouxingmoshi.shipeiqi * @Author: dingyunkai * @Description * @CreateTime: 2023/6/4 18:53 */public class Comuter {    public String readSd(SdCard sdCard){        if (sdCard == null){            throw new NullPointerException("sdCard is not null");        }        return sdCard.read();    }}