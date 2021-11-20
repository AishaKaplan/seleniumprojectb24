package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrlAndSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        String url="https://www.etsy.com";
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        System.out.println("Title: " +driver.getTitle());
        String etsyTitle=driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle);
        System.out.println("Current url: " +driver.getCurrentUrl());
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        System.out.println("HTML page source: " + driver.getPageSource());
        String html=driver.getPageSource();
        System.out.println("Count of html= " + html.length());
        driver.quit();
    }
}
