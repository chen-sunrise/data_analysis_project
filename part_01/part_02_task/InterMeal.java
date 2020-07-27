package com.lagou.housework;

/**
 * 上网套餐类
 * 特征：上网流量、每月资费
 * 行为：显示所有套餐信息
 */
public class InterMeal extends Meal implements InternetServer{
    private double internetTraffic;

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        if(internetTraffic >= 0)
        this.internetTraffic = internetTraffic;
        else System.out.println("流量没有负数!");
    }

    public InterMeal() {
    }

    @Override
    public void show(){
        System.out.println("上网流量为：" + getInternetTraffic() + "，每月消费为：" + getMonthCost());
    }

    @Override
    public void internetMeal(double internetTraffic, CardType ct) {
        System.out.println("继承接口，流量为：" + internetTraffic + "G");
        System.out.println("卡类型为：" + ct.getDesc());
    }

}
