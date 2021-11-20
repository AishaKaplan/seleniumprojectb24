package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC0 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "https://www.merriam-webster.com/ ";
        driver.get(url);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        int missingCounter=0;
        int counter=0;

        for (WebElement link : links) {
            link.getText();
            System.out.println(link.getText());
            if (link.getText().isEmpty()) {
                missingCounter++;
            } else {
                counter++;
            }
        }
        System.out.println("Total count of links= " + links.size());
        System.out.println(missingCounter+ " links missing texts");
        System.out.println(counter+ " links has a text");
        driver.close();
        }
    }

