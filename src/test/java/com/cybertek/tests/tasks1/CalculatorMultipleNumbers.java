package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorMultipleNumbers {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="https://www.calculator.net";
        driver.get(url);

        int num1=780;
        int num2=80;
        String number1=""+num1;
        String number2=""+num2;

        for(int i=0; i<number1.length(); i++){
            driver.findElement(By.xpath("//span[.='"+number1.charAt(i)+"']")).click();
        }
        WebElement plus= driver.findElement(By.xpath("//span[.='+']"));
        plus.click();

        for(int i=0; i<number2.length(); i++){
            driver.findElement(By.xpath("//span[.='"+number2.charAt(i)+"']")).click();
        }
        WebElement equal= driver.findElement(By.cssSelector("span[.='=']"));
        equal.click();

        WebElement result= driver.findElement(By.xpath("div[@id='sciOutPut']"));
        System.out.println("Result = "+result.getText());



    }
}
