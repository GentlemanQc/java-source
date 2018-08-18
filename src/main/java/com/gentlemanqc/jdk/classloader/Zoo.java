package com.gentlemanqc.jdk.classloader;

/**
 * @author: GentlemanQcc
 * @date: 2018/8/18
 * @see:
 * @since:
 */
public class Zoo{

    Person person = new Person("Zoo");

    {
        System.out.println("this is Zoo init block");
    }

    static{
        System.out.println("this is Zoo static block");
    }

    public Zoo() {
        System.out.println("this is Zoo constructor method");
    }
}