package shejimoshi.xingweimoshi.zhuangtaimoshi.after;/** * @Title: Context * @Package shejimoshi.xingweimoshi.zhuangtaimoshi.after * @Author: dingyunkai * @Description * @CreateTime: 2023/6/7 21:10 */public class Context {    public final static OpeningStatus OPENING_STATUS = new OpeningStatus();    public final static CloseNingStatus CLOSE_NING_STATUS = new CloseNingStatus();        public final static RunningStatus RUNNING_STATUS = new RunningStatus();        public final static StopningStatus STOPNING_STATUS = new StopningStatus();    private LiftState liftState;    public LiftState getLiftState() {        return liftState;    }    public void setLiftState(LiftState liftState) {        this.liftState = liftState;        liftState.setContext(this);    }    public void open(){        this.liftState.open();    }    public void stop(){        this.liftState.stop();    }    public void clos(){        this.liftState.close();    }    public void running(){        this.liftState.running();    }}