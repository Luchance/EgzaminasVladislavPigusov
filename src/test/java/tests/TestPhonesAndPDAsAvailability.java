package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

/**
 * Scenario:
 * 1) Navigates to Phones and PDAs tab
 * 2) Loops and check item status and prints it out
 */

public class TestPhonesAndPDAsAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testPhonesAndPDAsAvailability() {
        mainPage.getPhonesAndPDAs();
        mainPage.checkListOfPhonesAndPDAs();
    }
}
