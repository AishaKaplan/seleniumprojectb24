package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        String url="https://www.calculator.net";
        driver.manage().window().maximize();
        driver.get(url);
        int num1=5, num2=3;
        int expectedResult=8;

        WebElement firstNum= driver.findElement(By.cssSelector("span[onclick='r(5)']"));
        WebElement plus= driver.findElement(By.xpath("//span[.='+']"));
        WebElement secondNum= driver.findElement(By.cssSelector("span[onclick='r(3)']"));
        WebElement equal= driver.findElement(By.xpath("//span[.='=']"));

        firstNum.click();
        plus.click();
        secondNum.click();
        equal.click();
        Thread.sleep(2000);
WebElement result=driver.findElement(By.cssSelector("div[id='sciOutPut']"));
        System.out.println("Actual result = " + result.getText().trim());
        System.out.println("Expected result = " + expectedResult);

        int actualResult=Integer.parseInt(result.getText().trim());
        System.out.println("Result verification = " + ((actualResult==expectedResult) ? "PASS" : "FAIL"));
        driver.quit();






    }
}
