package ord.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {

    private final static String BASE_URL = "https://demoqa.com/";
    private final By FIRST_ALERT_BUTTON = By.id("alertButton");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "alerts");
    }
    public void clickOnTheFirstButton() {
        driver.findElement(FIRST_ALERT_BUTTON).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
