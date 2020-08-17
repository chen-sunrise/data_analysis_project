package com.lagou.housework01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LandlordGame {
    public static void main(String[] args) {
        String strings[] = {"大王","小王","2","A","K","Q","J","10","9","8","7","6","5","4","3"};

    }
    private static Map<Integer, String> buildLandlor(String[] strings){
        Map<Integer, String> m1 = new HashMap<>();
        for (int i = 0; i < strings.length; i++){
            m1.put(i, strings[(strings.length - i - 1)]);
        }
        //System.out.println("m1 = " + m1);
        return m1;
    }
    private static Map<String, Integer> buildLandlorNumber(String[] strings){
        Map<String, Integer> m2 = new HashMap<>();
        for (String string : strings) {
            if (string.equals("大王") || string.equals("小王")) {
                m2.put(string, 1);
            } else {
                m2.put(string, 4);
            }
        }
        //System.out.println("m2 = " + m2);
        return m2;
    }
    private static boolean setLandlorNumber(Map<String, Integer> m2, String key){
        Integer nowNumber = m2.get(key);
        if(0 == nowNumber){
            return false;
        }
        m2.put(key,nowNumber-1);
        return true;
    }

}
