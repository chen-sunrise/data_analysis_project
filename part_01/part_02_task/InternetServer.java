package com.lagou.housework;

/**
 * 上网服务接口
 * 抽象方法:
 * 参数 1: 上网流量
 * 参数 2: 手机卡类对象
 */
public interface InternetServer {
    public void internetMeal(double internetTraffic, CardType ct);
}
