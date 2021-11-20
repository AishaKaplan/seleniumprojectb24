package com.cybertek.tests.tasks1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTC4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://www.facebook.com";
        driver.get(url);
        String textOfLink=driver.findElement(By.linkText("Create a page")).getAttribute("href");
        String expectedResult="registration_form";
        System.out.println(textOfLink.contains(expectedResult)? "Passed" : "Failed");

        driver.close();
    }
}
