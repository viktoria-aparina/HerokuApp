package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs extends BaseTest {
    @Test
    public void inputLetters() {
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys("abc");
        Assert.assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "abc");
    }

    @Test
    public void inputDigits() {
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys("123");
        Assert.assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "123");
    }

    @Test
    public void inputSymbols() {
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys("***");
        Assert.assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "***");
    }

    @Test
    public void inputKeysArrow() {
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        //тут не знаю как правильно expected сделать
        Assert.assertEquals(driver.findElement(By.tagName("input")).getAttribute("value"), "0");
    }
}