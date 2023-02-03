package com.whp.synchronized_this;

import java.util.HashMap;

/**
 * @author Administrator
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "helloword";
        String s1 = "hello";
        String s2 = "word";
        StringTest.panDuan(s,s1,s2);



    }

    public static boolean panDuan(String s, String p1,String p2){
         String str = p1.concat(p2);
         if (s.equals(str)){

             System.out.println("true");
             return true;
         }
        System.out.println("false");
         return false;
    }

}
