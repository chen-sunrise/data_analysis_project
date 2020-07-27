package com.lagou.housework;

/**
 * 通话套餐类
 * 特征：通话时长、短信条数、每月资费
 * 行为: 显示所有套餐信息
 */
public class CallMeal extends Meal implements CallServer {
    private double callTime;
    private int messageCount;

    public double getCallTime() {
        return callTime;
    }

    public void setCallTime(double callTime) {
        if (callTime >= 0)
            this.callTime = callTime;
        else System.out.println("通话时长没有负数！");
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        if (messageCount >= 0)
            this.messageCount = messageCount;
        else System.out.println("短信条数没有负数！");
    }

    public CallMeal() {
    }

    @Override
    public void show() {
        System.out.println("通话时长为：" + getCallTime() + "，短信条数为：" + getMessageCount() +
                "，每月消费为：" + getMonthCost());
    }

    @Override
    public void mealServer(double callTime, CardType ct) {
        System.out.println("继承接口，通话时长为：" + callTime);
    }
}
