package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAndPracticeVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com");

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
String actualTitle=driver.getTitle();

if(actualTitle.equals(expectedTitle)){
    System.out.println("PASS: title verification successful");
}else{
    System.out.println("FAIL: title verification mismatched");
}
        System.out.println("actual title = " + actualTitle);
        System.out.println("expected title = " + expectedTitle);
        driver.get("http://www.practice.cybertekschool.com");

        driver.quit();
    }
}
