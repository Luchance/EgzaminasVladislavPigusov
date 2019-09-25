package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

/**
 * Scenario:
 * 1) Navigates to Cameras tab
 * 2) Loops and check item status and prints it out
 */

public class TestCamerasAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testCamerasAvailability() {
        mainPage.getCameras();
        mainPage.checkListOfCameras();
    }
}
