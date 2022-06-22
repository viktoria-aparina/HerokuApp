package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.List;

public class Checkboxes extends BaseTest {
    @Test
    public void checkbox() {
        driver.findElement(By.linkText("Checkboxes")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement element : elements) {
            if (!element.isSelected()) {
                element.click();
                Assert.assertTrue(element.isSelected());
//               or WebElement element1 = driver.findElement(By.cssSelector("input:checked[type='checkbox']"));
//                Assert.assertTrue(element1.isDisplayed());
            } else {
                element.click();
                Assert.assertFalse(element.isSelected());
            }
        }
    }
}