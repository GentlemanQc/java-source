package com.gentlemanqc.jdk.classloader;

/**
 * @author: GentlemanQcc
 * @date: 2018/8/18
 * @see:
 * @since:
 */
public class BeiJingZoo extends Zoo {

    Person person = new Person("BeiJingZoo");

    {
        System.out.println("this is BeiJingZoo init block");
    }

    static{
        System.out.println("this is BeiJingZoo static block");
    }

    public BeiJingZoo() {
        System.out.println("this is BeiJingZoo constructor method");
    }
}
