package com.lagou.housework01;

import com.lagou.task08.SubSuperTest;

public class SubStringTest {
    public static void main(String[] args) {
        String str1 = "asdafghjka";
        String str2 = "aaasdfg";

        // 若str2为str1的公共字符串，则返回
        if (str1.contains(str2)){
            System.out.println("公共字符串为：= " + str2);
            return;
        }

        // 否则调用获取公共字符串函数
        SubString ss = new SubString();
        String subString = ss.getSubString(str1, str2, str2.length());
        System.out.println("公共字符串为：= " + subString);

    }


}
