package com.cybertek.tests.tasks1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTC1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.facebook.com";
        driver.get(url);
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("PASS: Facebook title verification passed");
        } else{
            System.out.println("FAIL: Facebook title verification failed");
        }







    }
}
