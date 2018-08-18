package com.gentlemanqc.jdk.classloader;

/**
 * 此demo用来展示类加载顺序
 * 父类静态代码块->子类静态代码块->父类成员变量->父类初始化语句块->父类构造函数->子类成员变量->子类初始化语句块->子类构造函数
 * @author: GentlemanQcc
 * @date: 2018/8/18
 * @see:
 * @since:
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        new BeiJingZoo();
    }
}






