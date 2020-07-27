package com.lagou.housework;

/**
 * 用户消费信息类
 * 特征：统计通话时长、统计上网流量、每月消费金额
 */
public class UserCost {
    private double callTimeCount;
    private double internetTrafficCount;
    private double monthCostMoney;

    public UserCost() {
    }

    public double getCallTimeCount() {
        return callTimeCount;
    }

    public void setCallTimeCount(double callTimeCount) {
        if(callTimeCount >= 0)
        this.callTimeCount = callTimeCount;
        else System.out.println("统计通话时长没有负数！");
    }

    public double getInternetTrafficCount() {
        return internetTrafficCount;
    }

    public void setInternetTrafficCount(double internetTrafficCount) {
        if(internetTrafficCount >= 0)
        this.internetTrafficCount = internetTrafficCount;
        else System.out.println("统计上网流量没有负数！");
    }

    public double getMonthCostMoney() {
        return monthCostMoney;
    }

    public void setMonthCostMoney(double monthCostMoney) {
        if(monthCostMoney >= 0)
        this.monthCostMoney = monthCostMoney;
        else System.out.println("每月消费金额没有负数！");
    }
}
