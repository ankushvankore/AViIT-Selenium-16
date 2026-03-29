package com.TestNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D08TypesOfAssertion {
    @Test
    public void test1(){
        System.out.println("Test1 Started!!!");

        Assert.assertTrue(false);

        System.out.println("Test1 ends!!!");
    }

    @Test
    public void test2(){
        SoftAssert a1 = new SoftAssert();
        System.out.println("Test 2 Started!!!");

        a1.assertTrue(false);

        System.out.println("Test2 Ends!!!");

        a1.assertAll();
    }
}
