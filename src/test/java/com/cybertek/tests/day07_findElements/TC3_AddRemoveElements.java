package com.cybertek.tests.day07_findElements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_AddRemoveElements {
    public static void main(String[] args) {
        String url="http://practice.cybertekschool.com/add_remove_elements/";
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);
        WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        for (int i = 0; i < 50 ; i++) {
            addElement.click();
        }
        List<WebElement> deleteButtons=driver.findElements(By.xpath("//button[.='Delete']"));
        System.out.println("Count of delete buttons = "+ deleteButtons.size());
        if(deleteButtons.size() ==50) {
            System.out.println("Pass: 50 buttons added successfully");
        }else{
            System.out.println("Fail: cannot add 50 buttons");
        }
        for (WebElement deleteButton : deleteButtons) {
            deleteButton.click();
        }
        //deleteButtons.forEach(deleteBtn -> deleteBtn.click());
        deleteButtons=driver.findElements(By.xpath("//button[.='Delete']"));
        if(deleteButtons.isEmpty()){
            System.out.println("Pass: All 50 buttons deleted succesfully");
        }else{
            System.out.println("Fail: could not delete all 50 buttons");
        }
        driver.quit();
    }
}
