package shejimoshi.jiegouxingmoshi.qiaojiemoshi;/** * @Title: OpratingSystem * @Package shejimoshi.jiegouxingmoshi.qiaojiemoshi * @Author: dingyunkai * @Description * @CreateTime: 2023/6/5 20:45 */public abstract class OpratingSystem {    protected VideoFile videoFile;    public OpratingSystem(VideoFile videoFile) {        this.videoFile = videoFile;    }    public abstract void play(String fileName);}