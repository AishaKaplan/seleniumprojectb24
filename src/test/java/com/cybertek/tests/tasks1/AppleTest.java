package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="https://www.apple.com";
        driver.get(url);

        WebElement iPhone= driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']"));
        iPhone.click();
        List<WebElement> links= driver.findElements(By.tagName("a"));
        int linkCounter=0;
        int emptyLinkCounter=0;

        for(WebElement each : links){
            System.out.println("Link = " + each.getText());
            if(each.getText().isEmpty()){
                emptyLinkCounter++;
            }else{
                linkCounter++;
            }
        }

        System.out.println("Total links: " + links.size());
        System.out.println("Links have texts: "+ linkCounter);
        System.out.println("Empty links: "+ emptyLinkCounter);
        driver.close();

        }
    }

