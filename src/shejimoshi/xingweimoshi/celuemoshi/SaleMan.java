package shejimoshi.xingweimoshi.celuemoshi;/** * @Title: SaleMan * @Package shejimoshi.xingweimoshi.celuemoshi * @Author: dingyunkai * @Description * @CreateTime: 2023/6/6 20:32 */public class SaleMan {    private Strategy strategy;    public Strategy getStrategy() {        return strategy;    }    public void setStrategy(Strategy strategy) {        this.strategy = strategy;    }    public void saleManShow(){        strategy.show();    }}