package com.neusoft.java.shuzu;

import java.util.regex.Pattern;

/**
 * @Author: gjy
 * @Date: 2020/4/17 09:21
 */
public class zhengze {
    public String addition(String a, String b){
        String regex = "^[0-9]+$";
        if(!Pattern.matches(regex, a)){
            return "非法输入";
        }
        if(!Pattern.matches(regex, b)){
            return "非法输入";
        }
        Integer i1 =Integer.parseInt(a);
        Integer i2 =Integer.parseInt(b);
        Integer i3 =i1+i2;
        return i3.toString();
    }
     public static void main(String[] args) {
        zhengze zz =new zhengze();
            String a = "3";
            String b = "3";
        System.out.println(zz.addition(a,b));
         }
}
