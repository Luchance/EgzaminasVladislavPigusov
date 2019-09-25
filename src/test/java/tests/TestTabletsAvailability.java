package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

/**
 * Scenario:
 * 1) Navigates to Tablets tab
 * 2) Loops and check item status and prints it out
 */

public class TestTabletsAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testTabletsAvailability() {
        mainPage.getTablets();
        mainPage.checkListOfTablets();
    }
}
