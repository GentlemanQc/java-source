package com.gentlemanqc.jdk.protecteds.other;

import com.gentlemanqc.jdk.protecteds.Man;

/**
 * Created by GentlemanQcc on 2018/8/17.
 */
public class Doctor extends Man {

    private String name;

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
