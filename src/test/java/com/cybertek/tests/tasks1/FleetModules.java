package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FleetModules {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url="https://qa2.vytrack.com/user/login";
        driver.get(url);

        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("user22");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='_password']")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("/span[@class='title title-level-1']")).click();
        List<String>expectedMenuItems=new ArrayList<>(Arrays.asList("Vehicles", "Vehicle Odometer", "Vehicle Costs", "Vehicle Contracts", "Vehicles Fuel Logs", "Vehicle Services Logs", "Vehicles Model"));
        List<WebElement> menuItems=driver.findElements(By.xpath("//span[@class='title title-level-2']"));
        int count=0;
        while(count<menuItems.size()) {
            if (menuItems.get(count).getText().isEmpty()){
            menuItems.remove(count);
        }else{
                System.out.println("Menu Items = "+ menuItems.get(count).getText());
                count++;
            }
        }
        System.out.println("Fleet menu items = "+ (compare(expectedMenuItems, menuItems)? "Pass: All menu items are verified" : "Fail: Menu items are not verified"));
        driver.quit();
    }
    public static boolean compare (List<String>actual, List<WebElement> expected){
        if(actual.size()!= expected.size()) return false;
        int n= actual.size();
        for(int i=0; i<n; i++){
            if(!actual.get(i).equals(expected.get(i).getText())){
                System.out.println(actual.get(i) + "|" +expected.get(i).getText());
                return false;
            }
        }
        return true;
    }
}
