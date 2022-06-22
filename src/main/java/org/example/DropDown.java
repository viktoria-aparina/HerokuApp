package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends BaseTest {
    @Test
    public void dropDown() {
        driver.findElement(By.linkText("Dropdown")).click();
        driver.findElement(By.id("dropdown")).click();
        List<WebElement> dropDownList = driver.findElements(By.xpath("//option[contains(text(),'Option')]"));
        Assert.assertEquals(dropDownList.size(), 2);
        for (WebElement dropDownListElement : dropDownList) {
            dropDownListElement.click();
            Assert.assertTrue(dropDownListElement.isSelected());
            driver.findElement(By.id("dropdown")).click();
        }
    }
}