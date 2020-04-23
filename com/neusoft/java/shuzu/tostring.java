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
        System.out.println("str==str1�Ľ��Ϊ��" + (str == str1));
//==�����ǶԱ�str��str1����������ĵ�ַ�Ƿ�һ�£�
        System.out.println("str.equals(str1)�Ľ��Ϊ��" + str.equals(str1));
//equals���������ǱȽ�str��str1����������������Ƿ�һ�£�
        tostring p1 = new tostring("xiaowang", 12);
        tostring p2 = new tostring("xiaowang", 12);

        if (p1.equals(p2)) {
            System.out.println("p1����p2!");
        } else {
            System.out.println("p1������p2!");
        }
        System.out.println("0-200�е��������" + (int) (Math.random() * 200));
        System.out.println("50��2.1������ֵΪ��" + Math.max(50, 2.1));
        //50��2.1��������ֵΪ��
        System.out.println("70��12����С��ֵΪ��" + Math.min(70, 12));
        //70��12�������СֵΪ��

        String Str = "abckdkkkklssdk";
        String Str1 = "jihad";
        System.out.println("���ַ����ĳ���Ϊ��" + Str.length());
        System.out.println("�ַ�k��һ�γ��ֵ�λ��Ϊ��" + (Str.indexOf("k") + 1));
        System.out.println("���ַ�s��ΪtΪ��" + Str.replace("abckdkkkklssdk", "abckdkkkklttdk"));
        System.out.println("str1������str�ĺ���Ϊ��" + Str + Str1);


        StringBuffer str4 = new StringBuffer();
        str4.append("world");
        //�������world;
        System.out.println(str4);
        str4.insert(0, "hello");
        //�ڵ�һ������֮ǰ�������hello;
        System.out.println(str4);
        str4.replace(4, 9, "limps");
        //����5~9��ĸ�滻Ϊlinpp;
        System.out.println(str4);

        Integer s5 = new Integer(0);
        int i = s5.intValue();
        System.out.println(i);
        int a = 10;
        Integer A = Integer.valueOf(a);
        System.out.println(A);

    }

}

