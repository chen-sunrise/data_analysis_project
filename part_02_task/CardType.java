package com.lagou.housework;

/**
 * 设计和实现以下枚举类
 * 手机卡的类型总共有 3 种：大卡、小卡、微型卡
 */
public enum CardType {
    SMALL("小卡"),BIG("大卡"),MICRO("微卡");
    private final String desc;

    public String getDesc(){
        return desc;
    }

    private CardType(String desc){
        this.desc = desc;
    }
}
