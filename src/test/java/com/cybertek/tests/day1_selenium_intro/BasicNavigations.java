package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1) Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //Open browser
        WebDriver driver=new ChromeDriver();

        //navigate to tesla homepage
        driver.get("https://www.tesla.com");

        driver.navigate().back();
        // pause the code. code will sleep/wait
        Thread.sleep(2000);
        driver.navigate().forward();
      driver.navigate().refresh();
      driver.navigate().to("https://www.etsy.com");
        System.out.println("Current title: " + driver.getTitle());
        driver.quit();
    }
}
