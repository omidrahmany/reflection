package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*// write your code here
        String s = "Ali";
        List<String> list;
        list = new ArrayList<>();
        boolean a,b,c,d,e,f,g,h,i;

        a = s instanceof String;
        b = s instanceof Serializable;
        d = list instanceof Serializable;
        e = list instanceof Collection;
        f = list instanceof ArrayList;
        g = list instanceof LinkedList;
        *//*c = s instanceof List;
        h = list instanceof String;
        i = list instanceof Collection<String>;*//*
        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
//        System.out.println(h);
//        System.out.println(i);*/

        Person person = new Student("Omid", "kharazmi");
        String simpleName = person.getClass().getSimpleName();
        System.out.println(simpleName);
        String name = person.getClass().getName();
        System.out.println(name);

    }
}



