package com.gentlemanqc.jdk.protecteds.other;

import com.gentlemanqc.jdk.protecteds.Man;
import com.gentlemanqc.jdk.protecteds.Student;

/**
 * Created by GentlemanQcc on 2018/8/17.
 */
public class ProtectedMain2 {

    public static void main(String[] args){
        Man man = new Doctor();
//        man.setAge(20);
        Doctor doctor = new Doctor();
//        doctor.setAge(20);
    }

}
