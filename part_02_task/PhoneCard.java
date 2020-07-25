package com.lagou.housework;

/**
 * 手机卡类
 * 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量
 * 行为：显示（卡号 + 用户名 + 当前余额）
 */
public class PhoneCard {
    // 卡类型
    private int cardType;
    // 卡号
    private int cardNumber;
    // 用户名
    private String user;
    // 密码
    private char password;
    // 账户余额
    private double accountOverage;
    // 通话时长（分钟）
    private double callTime;
    // 上网流量
    private double internetTraffic;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        if(cardNumber > 0)
        this.cardNumber = cardNumber;
        else System.out.println("卡号没有负数！");
    }

    public String getUser() {
        return user;
    }

    public double getAccountOverage() {
        return accountOverage;
    }

    public void setAccountOverage(double accountOverage) {
        this.accountOverage = accountOverage;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void show(){
        System.out.println("卡号 + 用户名 + 当前余额 = " + (getCardNumber() + getUser() + getAccountOverage()));
    }
}
