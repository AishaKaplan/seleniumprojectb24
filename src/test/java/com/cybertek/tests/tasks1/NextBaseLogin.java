package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextBaseLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        String url="https:/login2.nextbasecrm.com/";
        driver.manage().window().maximize();
        driver.get(url);

        WebElement logIn=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        System.out.println("Login " +logIn.isDisplayed());
        logIn.sendKeys("marketing15@cybertekschool.com");
      //  String userLog= logIn.getText();

        WebElement passWord=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        System.out.println("Password " + passWord.isDisplayed());
        passWord.sendKeys("UserUser");

        WebElement rememberMe= driver.findElement(By.xpath("//input[@name='USER_REMEMBER']"));
        System.out.println("RememberMe "+ rememberMe.isDisplayed());
        rememberMe.click();

        WebElement loginClick= driver.findElement(By.xpath("//input[@type='submit']"));
       System.out.println("LoginClick "+ loginClick.isDisplayed());
      loginClick.click();


        WebElement actualUser=driver.findElement(By.id("user-name"));
        String UserName=actualUser.getText();
        System.out.println(UserName.contains(actualUser.getText())? "Correct User name": "Wrong User name");

        WebElement onClick=driver.findElement(By.xpath("//div[@onclick='showUserMenu()']"));
        onClick.click();
        WebElement logOut=driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
