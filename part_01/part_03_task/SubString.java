package com.lagou.housework01;

public class SubString {
    public String getSubString(String str1, String str2, int length) {
        String str = null;
        for (int i = 0; i < str2.length() - length; i++){
            str = str2.substring(i,i + length);
            if (str1.contains(str)) {
                return str;
            }
        }
        length -= 1;
        return getSubString(str1,str2,length);
    }
}
