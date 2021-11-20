package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_MultipleButtonsXpathTest {
    public static void main(String[] args) {
        String appUrl="http://practice.cybertekschool.com/multiple_buttons";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(appUrl);

        WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        WebElement resultMsg= driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(resultMsg.getText());

        WebElement button2=driver.findElement(By.xpath("//button[text()='Button 2']"));
        if(button2.isDisplayed()){
            System.out.println("PASS: Button2 is displayed");
            button2.click();
        } else{
            System.out.println("FAIL: Button2 is not displayed");
        }
        driver.quit();
    }
}
