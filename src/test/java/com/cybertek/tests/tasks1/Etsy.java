package com.cybertek.tests.tasks1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://etsy.com";
        driver.get(url);
        driver.findElement(By.name("search_query")).sendKeys("wooden spoon" + Keys.ENTER);
        Thread.sleep(2000);
        String title=driver.getTitle();
        String expectedTitle="wooden spoon";
        if(title.contains(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.findElement(By.linkText("Holiday Shop")).click();
        String header=driver.findElement(By.tagName("h1")).getText();
        String expectedHeader="The Holiday Shop";
        if(header.contains(expectedHeader)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}
