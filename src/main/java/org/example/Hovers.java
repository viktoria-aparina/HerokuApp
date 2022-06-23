package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Hovers extends BaseTest { //на втором элементе валится, не может найти имя, не знаю почему!?
    @Test
    public void hovers() {
        driver.findElement(By.linkText("Hovers")).click();
        List<WebElement> usersPhotos = driver.findElements(By.cssSelector("img[alt='User Avatar']")); //src='/img/avatar-blank.jpg'
        for (WebElement element : usersPhotos) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            WebElement name = driver.findElement(By.xpath("//*[contains(text(), 'name:')]"));
            Assert.assertTrue(name.isDisplayed());
            WebElement viewProfile = driver.findElement(By.xpath("//a[contains(@href,'users')]"));
            actions.moveToElement(viewProfile).click(viewProfile).build().perform();
            WebElement mistake = driver.findElement(By.xpath("/html/body/h1"));
            Assert.assertTrue(mistake.isDisplayed());
            driver.navigate().back();
        }
    }
}
