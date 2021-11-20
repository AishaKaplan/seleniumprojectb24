package com.cybertek.tests.tasks1;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GasMileageCalculatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url="https://www.calculator.net ";
        driver.get(url);

        WebElement searchBox= driver.findElement(By.name("calcSearchTerm"));
        searchBox.sendKeys("gas mileage");

        WebElement gasMileageLink= driver.findElement(By.linkText("Gas Mileage Calculator"));
        gasMileageLink.click();

        String expectedTitle="Gas Mileage Calculator";
        String actualTitle= driver.getTitle();
        if(expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification passed.\n\"Gas Mileage Calculator\" label is displayed");
        }else{
            System.out.println("Title verification failed");
        }
        WebElement currentOdometerField= driver.findElement(By.name("uscodreading"));
        currentOdometerField.clear();
        currentOdometerField.sendKeys("7925");

        WebElement previousOdometerField= driver.findElement(By.name("uspodreading"));
        previousOdometerField.clear();
        previousOdometerField.sendKeys("7550");

        WebElement gasAddedField= driver.findElement(By.name("usgasputin"));
        gasAddedField.clear();
        gasAddedField.sendKeys("16");

        WebElement gasPrice= driver.findElement(By.name("usgasprice"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");

        WebElement calculateButton= driver.findElement(By.cssSelector("input[value='Calculate']"));
        calculateButton.click();

        WebElement mpgValue= driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b"));
        System.out.println("Gas price result is: "+ mpgValue.getText());

    }
}
