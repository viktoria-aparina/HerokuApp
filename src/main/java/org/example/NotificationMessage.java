package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessage extends BaseTest {
    @Test
    public void notificationMessage() {
        driver.findElement(By.linkText("Notification Messages")).click();
        driver.findElement(By.linkText("Click here")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("div.flash"))).build().perform();
        Assert.assertEquals(driver.findElement(By.cssSelector("div.flash")).getText(), "Action successful");
        //вообще не понимаю как это работает, нашла в интернете)
    }
}
