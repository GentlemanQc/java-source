package com.gentlemanqc.jdk.classloader;

/**
 * @author: GentlemanQcc
 * @date: 2018/8/18
 * @see:
 * @since:
 */
public class Person{

    static{
        System.out.println("this is Person static block");
    }

    public Person(String str) {
        System.out.println("this is Person constructor from " + str);
    }
}
