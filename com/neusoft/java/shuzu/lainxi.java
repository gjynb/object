package com.neusoft.java.shuzu;

import java.util.Arrays;

/**
 * @Author: gjy
 * @Date: 2020/4/16 11:31
 */
public class lainxi {
    public static void main(String args[]) {
        int data[] = new int[3];
        /*������һ������Ϊ3������*/
        data[0] = 10;
        // ��һ��Ԫ��
        data[1] = 20;
        // �ڶ���Ԫ��
        data[2] = 30;
        // ������Ԫ��
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]);
            //ͨ��ѭ����������
        }
        String[] strArray = {"aa", "bc", "ab", "cd"};
        Arrays.sort(strArray);
        int ind4 = Arrays.binarySearch(strArray, "bc");
        System.out.println("'bc'�Ĳ���λ���ǣ�" + ind4);
    }
}
