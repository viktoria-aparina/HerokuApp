package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertTrue;

public class FileDownloadTest extends BaseTest {

    @Test
    public void downloadTest() throws InterruptedException {

        driver.findElement(By.linkText("File Download")).click();
        driver.findElement(By.linkText("sample.pdf")).click();
        Thread.sleep(1000);

        File folder = new File("C:\\Users\\User\\Downloads");
        File[] listOfFiles = folder.listFiles();

        boolean found = false;
        File f = null;

        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                if (fileName.matches("sample.pdf")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        assertTrue(found, "Downloaded document is not found");
        f.deleteOnExit();
    }
}