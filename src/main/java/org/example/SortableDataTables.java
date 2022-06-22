package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTables extends BaseTest {
    @Test
    public void Table1Column0String0() {
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table1']/thead/tr//th[1]")).getText(), "Last Name");
    }

    @Test
    public void Table1Column2String3() {
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[3]//td[3]")).getText(), "jdoe@hotmail.com");
    }

    @Test
    public void Table1Column4String2() {
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[2]//td[5]")).getText(), "http://www.frank.com");
    }

    @Test
    public void Table2Column1String4() {
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[4]//td[2]")).getText(), "Tim");
    }

    @Test
    public void Table2Column3String1() {
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[1]//td[4]")).getText(), "$50.00");
    }

    @Test
    public void Table2Column5String3() {
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[3]//td[6]/a[1]")).getText(), "edit");
    }
}
