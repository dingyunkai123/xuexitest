package shejimoshi.xingweimoshi.zerenlian;/** * @Title: GroupLeader * @Package shejimoshi.xingweimoshi.zerenlian * @Author: dingyunkai * @Description * @CreateTime: 2023/6/7 20:37 */public class GroupLeader extends Handler{    public GroupLeader() {        super(0,Handler.num_one);    }    @Override    protected void hanleLeave(LeaveRequest leaveRequest) {        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天," + leaveRequest.getContent());        System.out.println("小组长同意");    }}