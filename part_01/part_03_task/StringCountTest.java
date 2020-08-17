package com.lagou.housework01;


public class StringCountTest {
    public static void main(String[] args) {
        String str1 = "ABCD123!@#$%ab";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        byte[] bytes = str1.getBytes();
        for (byte b: bytes) {
            if(b >= 65 && b <= 90)
                count1 ++;
            else if(b >= 48 && b <= 57)
                count2 ++;
            else if(b >= 97 && b <= 122)
                count3 ++;
        }
        System.out.println("大写字母个数为：" + count1);
        System.out.println("数字个数为：" + count2);
        System.out.println("小写字母个数为：" + count3);
        System.out.println("其他字符个数为：" + (bytes.length - (count1 + count2 + count3)));
    }
}
