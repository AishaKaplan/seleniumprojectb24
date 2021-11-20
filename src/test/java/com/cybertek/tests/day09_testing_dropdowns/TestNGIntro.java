package com.cybertek.tests.day09_testing_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntro {
    String url = "https://www.etsy.com";

    @BeforeClass
    public void setUp(){
        System.out.println("@BeforeClass setUp method...");
        System.out.println("Opened browser and Navigating to "+ url);
        System.out.println(" =======================");
    }
    @BeforeMethod
    public void setUpApp(){
        System.out.println("@BeforeMethod setUp Method is running...");
        System.out.println("Navigating back to  " + url);
        System.out.println("=========================");
    }

    @Test(priority=1)
    public void test1() {
        System.out.println("Running test1 ...");
        int num = 10;
        Assert.assertEquals(10, num);
    }

    @Test(priority = 2)
    public void myTest2() {
        System.out.println("Running Test");
        String name = "Bob";
        Assert.assertTrue(name.contains("b"));

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("@AfterMethod tearDown is running...");
        System.out.println("=====================");
    }
    @AfterClass
    public void cleanUp(){
        System.out.println("@AfterClass cleanup method is running......");
        System.out.println("====================");
    }
}