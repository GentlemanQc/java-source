package com.gentlemanqc.jdk.protecteds;

/**
 * Created by GentlemanQcc on 2018/8/17.
 */
public class Student extends Man{

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

