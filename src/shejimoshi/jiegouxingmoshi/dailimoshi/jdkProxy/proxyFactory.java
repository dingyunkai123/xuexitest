package shejimoshi.jiegouxingmoshi.dailimoshi.jdkProxy;import java.lang.reflect.InvocationHandler;import java.lang.reflect.Method;import java.lang.reflect.Proxy;/** * @Title: proxyFactory * @Package shejimoshi.jiegouxingmoshi.dailimoshi.jdkProxy * @Author: dingyunkai * @Description * @CreateTime: 2023/6/4 14:24 */public class proxyFactory {    private TrainStation trainStation = new TrainStation();    public SellTickets getProxyObject(){        /**         * ClassLoader loader, 目标类的装载器         * Class<?>[] interfaces,代理类实现的接口的字节码         * InvocationHandler h，代理对象的处理程序         */        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(                trainStation.getClass().getClassLoader(),                trainStation.getClass().getInterfaces(),                new InvocationHandler() {                    @Override                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {                        System.out.println("执行开始");                        Object invoke = method.invoke(trainStation);                        System.out.println("执行结束");                        return invoke;                    }                }        );        return sellTickets;    }}