package com.neusoft.java.shuzu;

import java.util.Objects;

/**
 * @Author: gjy
 * @Date: 2020/4/17 14:19
 */
public class tostring {
    String name;
    int age;

    tostring(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        tostring tostring = (tostring) o;
        return age == tostring.age &&
                Objects.equals(name, tostring.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Double s = new Double(22);
        String s1 = new String("xx");
        Integer s2 = new Integer(23);
        StringBuffer s3 = new StringBuffer("xxx");
        System.out.println(s.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        String str = new String("hello");
        String str1 = "hello";
        System.out.println("str==str1的结果为：" + (str == str1));
//==方法是对比str、str1这两个对象的地址是否一致；
        System.out.println("str.equals(str1)的结果为：" + str.equals(str1));
//equals（）方法是比较str、str1这两个对象的内容是否一致；
        tostring p1 = new tostring("xiaowang", 12);
        tostring p2 = new tostring("xiaowang", 12);

        if (p1.equals(p2)) {
            System.out.println("p1等于p2!");
        } else {
            System.out.println("p1不等于p2!");
        }
        System.out.println("0-200中的随机数：" + (int) (Math.random() * 200));
        System.out.println("50与2.1中最大的值为：" + Math.max(50, 2.1));
        //50与2.1中输出最大值为；
        System.out.println("70与12中最小的值为：" + Math.min(70, 12));
        //70与12中输出最小值为；

        String Str = "abckdkkkklssdk";
        String Str1 = "jihad";
        System.out.println("该字符串的长度为：" + Str.length());
        System.out.println("字符k第一次出现的位置为：" + (Str.indexOf("k") + 1));
        System.out.println("将字符s改为t为：" + Str.replace("abckdkkkklssdk", "abckdkkkklttdk"));
        System.out.println("str1连接在str的后面为：" + Str + Str1);


        StringBuffer str4 = new StringBuffer();
        str4.append("world");
        //添加内容world;
        System.out.println(str4);
        str4.insert(0, "hello");
        //在第一个内容之前添加内容hello;
        System.out.println(str4);
        str4.replace(4, 9, "limps");
        //将第5~9字母替换为linpp;
        System.out.println(str4);

        Integer s5 = new Integer(0);
        int i = s5.intValue();
        System.out.println(i);
        int a = 10;
        Integer A = Integer.valueOf(a);
        System.out.println(A);

    }

}

