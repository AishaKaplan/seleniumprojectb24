package com.cybertek.tests.tasks1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTC2 {

public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    String url="https://www.facebook.com/";
    driver.get(url);
    driver.findElement(By.cssSelector("[title='Allow All Cookies']")).click();
    String userName="aylindam21@yahoo.com";
    String password="Odevsifre23";
    Thread.sleep(2000);
    driver.findElement(By.name("email")).sendKeys(userName);
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.name("login")).click();
    Thread.sleep(4000);
    String expectedTitle="Log into Facebook";
    String title=driver.getTitle();
    if(title.equals(expectedTitle)){
        System.out.println("PASS: Title is verified");
    } else{
        System.out.println("FAIL: Title is not verified");
    }
    driver.close();
        }
        }