package com.lagou.housework;

/**
 * 通话服务接口
 * 抽象方法:
 * 参数 1: 通话分钟
 * 参数 2: 手机卡类对象 让通话套餐类实现通话服务接口
 */
public interface CallServer{
    public void mealServer(double callTime, CardType ct);
}
