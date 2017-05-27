package com.jwen.test.testngTest.service;

public class TestB {

    public static String getB(){
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        return "B";
    }
}
