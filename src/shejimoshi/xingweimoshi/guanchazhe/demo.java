package shejimoshi.xingweimoshi.guanchazhe;/** * @Title: demo * @Package shejimoshi.xingweimoshi.guanchazhe * @Author: dingyunkai * @Description * @CreateTime: 2023/6/7 21:37 */public class demo {    public static void main(String[] args) {        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();        subscriptionSubject.attach(new WxUser("1"));        subscriptionSubject.attach(new WxUser("2"));        subscriptionSubject.attach(new WxUser("3"));        subscriptionSubject.notfiy("123kofko");    }}