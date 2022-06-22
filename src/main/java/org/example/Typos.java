package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Typos extends BaseTest {
    @Test
    public void typos() {
        driver.findElement(By.linkText("Typos")).click();
        if (driver.findElement(By.tagName("//*[@id='content']/div/p[2]")).getText().equals("Sometimes you'll see a typo, other times you won't.")) {
            System.out.println("The text is correct");
        } else {
            System.out.println("The text has typos");
        }
    }
}
