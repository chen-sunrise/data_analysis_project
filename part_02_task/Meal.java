package com.lagou.housework;

/**
 * 实体类的优化
 * 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类
 */
public abstract class Meal {
    private double monthCost;

    public double getMonthCost() {
        return monthCost;
    }

    public void setMonthCost(double monthCost) {
        if(monthCost >= 0)
        this.monthCost = monthCost;
        else System.out.println("每月消费没有负数！");
    }

    public abstract void show();

}
