package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        driver.findElement(By.linkText("Context Menu")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("hot-spot"))).contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu", "The text in alert is different");
        alert.accept();
    }
}