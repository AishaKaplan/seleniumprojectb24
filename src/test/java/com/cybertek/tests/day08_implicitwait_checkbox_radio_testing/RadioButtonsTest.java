package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        String url="http://practice.cybertekschool.com/radio_buttons";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement red= driver.findElement(By.id("red"));
        if(!red.isSelected()){
            red.click();
        }
        WebElement football= driver.findElement(By.id("football"));
        if(!football.isSelected()){
            football.click();
        }else{
            System.out.println("Football is selected");
        }
        if(football.isSelected()){
            System.out.println("PASS - football is selected");
        }else{
            System.out.println("FAIL - football is not selected");
        }
        List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("count = " + radioButtons.size());
        for (WebElement radio : radioButtons) {
            if(radio.isEnabled()){
            radio.click();
            Thread.sleep(3000);
        }
            driver.quit();
        }

    }
}
