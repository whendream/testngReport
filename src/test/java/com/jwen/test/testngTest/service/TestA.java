package com.jwen.test.testngTest.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {

    @Test
    public void testA (){
        System.out.println("AAAAAAAAAAAAAAAAAAA");
    }
    
    @Test
    public void testF (){
        System.out.println("dddddddddddddddddd");
        Assert.assertEquals(1, 0);
    }
    
    @Test
    public void testD (){
        System.out.println("dddddddddddddddddd");
    }
}
