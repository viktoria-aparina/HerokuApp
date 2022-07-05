package org.tests;

import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {

    @Test
    public void theFirstAlertTest() {
        alertsPage.open();
        alertsPage.clickOnTheFirstButton();
        alertsPage.acceptAlert();


    }
}
