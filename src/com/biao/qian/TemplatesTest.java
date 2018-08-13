package com.biao.qian;

import java.util.ArrayList;

public class TemplatesTest {

    //psvm
    public static void main(String[] args) {
        //sout
        //soutp
        //soutm
        //soutv
        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        String[] s={"adf","dfef","ghj"};
        //fori
        for (String s1 : s) {
            System.out.println(s1);
        }
        //iter
        for (int i = 0; i < s.length; i++) {
            System.out.println("i = " + i);
        }
        //itar
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            System.out.println("s1 = " + s1);
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        //list.for
        for (String s1 : list) {
            System.out.println("s1 = " + s1);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }
    public void method(){
        ArrayList<Object> objects = new ArrayList<>();
        //ifn
        if (objects == null) {
            
        }
        //inn
        if (objects != null) {

        }
        //xxx.nn or xxx.null
        if (objects != null) {

        }
        if (objects == null) {

        }
    }
}
