package com.cybertek.tests.tasks1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTC3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://facebook.com";
        driver.get(url);

        String expectedHeader="Connect with friends and the world around you on Facebook.";
        String actualHeader=driver.findElement(By.tagName("h2")).getText();
        if(actualHeader.equals(expectedHeader)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
