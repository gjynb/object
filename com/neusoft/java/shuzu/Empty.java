package com.neusoft.java.shuzu;

import java.rmi.RemoteException;
import java.util.*;

/**
 * @Author: gjy
 * @Date: 2020/4/20 08:58
 */
public class Empty {


    public static void main(String[] args) {
        String atrArr = "a,b,c";
        String[] split = atrArr.split(",");
        List<String> tempList = Arrays.asList(split);
        //数组变集合
        System.out.println(Arrays.toString(split));
        System.out.println(tempList);
        System.out.println(Collections.binarySearch(tempList, "b"));
        Map<String, String> map = new HashMap<String, String>();
        map.put("星期一", "Monday");
        map.put("星期日", "Sunday");
        System.out.println(map);
        System.out.println(map.put("星期一", "Mon"));
        System.out.println(map);
        String en = map.get("星期日");
        System.out.println(en);
        String value = map.remove("星期日");
        System.out.println(value);
        System.out.println(map);


        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");

    }

    public void deposit(double amount) throws RemoteException {
        // Method implementation
        throw new RemoteException();
    }


}
