package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppleHeaders {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="https://www.apple.com";
        driver.get(url);
        WebElement mac= driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-mac']"));
        Thread.sleep(4000);
        mac.click();
        System.out.println("Title is: "+ driver.getTitle());
        List<WebElement> linksMac= driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+ linksMac.size());
//        int missingLinksForMac=0;
//        for(WebElement each: linksMac) {
//            each.getText();
//            if (linksMac.isEmpty()) {
//                missingLinksForMac++;
//            }
//        }
//        System.out.println("Missing links for Mac: "+ missingLinksForMac);

        WebElement iPad= driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-ipad']"));
        iPad.click();
        System.out.println("Title is: "+ driver.getTitle());
        List<WebElement> linksIpad= driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+ linksIpad.size());

        WebElement iPhone= driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-iphone']"));
        iPhone.click();
        System.out.println("Title is: "+ driver.getTitle());
        List<WebElement> linksIphone= driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+ linksIphone.size());

        WebElement watch=driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-watch']"));
        watch.click();
        System.out.println("Title is: "+ driver.getTitle());
        List<WebElement> linksWatch= driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+ linksWatch.size());

        WebElement support= driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-support']"));
        support.click();
        System.out.println("Title is: "+driver.getTitle());
        List<WebElement> linksSupport=driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+linksSupport.size());

        driver.get("https://support.apple.com");
        WebElement tv= driver.findElement(By.cssSelector("a[class='ac-gn-link ac-gn-link-tv']"));
        tv.click();
        System.out.println("Title is: "+ driver.getTitle());
        List<WebElement>linksTv=driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+ linksTv.size());


//        int missingLinksForIpad=0;
//        int missingLinksForIphone=0;
//        int missingLinksForWatch=0;
//        int missingLinksForSupport=0;
//        int missingLinksForTv=0;
//
//
//         for(WebElement each: linksIpad){
//            each.getText();
//            if(linksIpad.isEmpty()){
//                missingLinksForIpad++;
//            }
//        } for(WebElement each: linksIphone){
//            each.getText();
//            if(linksIphone.isEmpty()){
//                missingLinksForIphone++;
//            }
//        }for(WebElement each: linksWatch){
//            each.getText();
//            if(linksWatch.isEmpty()){
//                missingLinksForWatch++;
//            }
//        }for(WebElement each: linksSupport){
//            each.getText();
//            if(linksSupport.isEmpty()){
//                missingLinksForSupport++;
//            }
//        }for(WebElement each: linksTv){
//            each.getText();
//            if(linksTv.isEmpty()){
//                missingLinksForTv++;
//            }
//        }
//        System.out.println("Number of empty links for Mac: "+ missingLinksForMac);
//        System.out.println("Number of empty links for Ipad: "+ missingLinksForIpad);
//        System.out.println("Number of empty links for Iphone: "+ missingLinksForIphone);
//        System.out.println("Number of empty links for Watch: " + missingLinksForWatch);
//        System.out.println("Number of emtpty links for Support: "+missingLinksForSupport);
//        System.out.println("Number of empty links for TV: "+ missingLinksForTv);








    }
}
