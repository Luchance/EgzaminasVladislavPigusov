package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

/**
 * Scenario:
 * 1) Navigates to Laptops and Notebooks tab
 * 2) Loops and check item status and prints it out
 */

public class TestLaptopsAndNotebooksAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testLaptopsAndNotebooks() {
        mainPage.getLaptopsAndNotebooks();
        mainPage.checkListOfLaptopsAndNotebooks();
    }
}
