package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void uploadTest() {
        driver.findElement(By.linkText("File Upload")).click();
        String filePath = System.getProperty("user.dir") + "/src/main/resources/TestFile";
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filePath);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "TestFile", "The file's names are different");
    }
}