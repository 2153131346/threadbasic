package com.whp.synchronized_this;
import java.lang.Integer;

import java.util.HashMap;

/**
 * @author Administrator
 */
public class HashMapTest {
    public static void main(String[] args) {
        Integer i = 42;
        Long l = 42L;
        Double d = 42.0;

//        System.out.println((i == l));
        System.out.println((i*1 == d));
//        System.out.println((l == d));
        System.out.println(i.equals(d));
        System.out.println(d.equals(l));
        System.out.println(i.equals(l));

        System.out.println(l.equals(42L));
        System.out.println(l.equals(42));

        String str = "hello";
//        str += '     a';
        int strlen = str.length();
//        str=100;
        System.out.println(str = str + 100);

        System.out.println("===============");
        HashMap<String , String> hashMap  = new HashMap<>();
        hashMap.put("1", "zhangsan ");
        System.out.println(hashMap.put("1", "zhangsan ").hashCode());
        hashMap.put("1","lisi");
        System.out.println(hashMap.put("1", "lisi ").hashCode());
        System.out.println(hashMap.get("1"));


    }

}
