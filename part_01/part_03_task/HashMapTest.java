package com.lagou.housework01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        Map<String,String> m1 = new HashMap<>();
        m1.put("1","123");
        m1.put("2","123");
        m1.put("3","456");
        m1.put("4","789");
        m1.put("5","456");

        Set<String> s1 = m1.keySet();
        for (String ts : s1
             ) {
            String str = m1.get(ts);
            if (str.equals("123")){
                count1 ++;
            }else if (str.equals("456")){
                count2 ++;
            }else if (str.equals("789")){
                count3 ++;
            }
        }
        System.out.println("'123'出现的次数为：" + count1);
        System.out.println("'456'出现的次数为：" + count2);
        System.out.println("'789'出现的次数为：" + count3);
    }
}
