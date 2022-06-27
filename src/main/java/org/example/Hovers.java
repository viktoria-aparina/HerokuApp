package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Hovers extends BaseTest {
    @Test
    public void hovers() {
        driver.findElement(By.linkText("Hovers")).click();
        List<WebElement> usersPhotos = driver.findElements(By.cssSelector(".figure"));
        Actions actions = new Actions(driver);
        for (WebElement element : usersPhotos) {
            actions.moveToElement(element).build().perform();
            element.findElement(By.tagName("h5")).isDisplayed();
            element.findElement(By.linkText("View profile")).click();
            driver.findElement(By.tagName("h1")).isDisplayed();
            driver.navigate().back();
        }
    }
}




