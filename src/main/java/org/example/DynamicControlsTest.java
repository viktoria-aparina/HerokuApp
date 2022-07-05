package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void checkboxTest() {
        driver.findElement(By.linkText("Dynamic Controls")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='message']")));
        if (driver.findElements(By.xpath("//input[@type='checkbox']")).isEmpty()) {
            System.out.println("Test was completed");
        } else {
            System.out.println("Test was failed");
        }
    }

    @Test
    public void inputTest() {
        driver.findElement(By.linkText("Dynamic Controls")).click();
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        assertFalse(input.isEnabled(), "The input is enabled");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        input.sendKeys("123456");
        assertTrue(input.isEnabled(), "The input is disabled");
    }
}