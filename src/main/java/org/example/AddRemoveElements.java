package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElements extends BaseTest {

    @Test
    public void addRemoveElement() {
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        List<WebElement> deletes = driver.findElements(By.xpath("//button[text()='Delete']"));
        int size = deletes.size();
        Assert.assertEquals(size,2);
    }
}