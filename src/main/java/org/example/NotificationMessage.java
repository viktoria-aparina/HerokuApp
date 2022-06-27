package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessage extends BaseTest {
    @Test
    public void notificationMessage() {
        driver.findElement(By.linkText("Notification Messages")).click();
        driver.findElement(By.linkText("Click here")).click();
        String notificationMessageFull = driver.findElement(By.className("notice")).getText();
        String notificationMessage = notificationMessageFull.substring(0, notificationMessageFull.length()-1).strip();
        Assert.assertEquals(notificationMessage, "Action unsuccesful, please try again");
    }
}
