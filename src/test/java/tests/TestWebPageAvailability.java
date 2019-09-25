package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

/**
 * Basic test to insure that WebPage and WebElements functioning right
 * Navigates to needed tabs without interruptions
 */

public class TestWebPageAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testWebPageAvailability() {
        mainPage.getCameras();
        mainPage.getDesktops();
        mainPage.getLaptopsAndNotebooks();
        mainPage.getMP3Players();
        mainPage.getPhonesAndPDAs();
        mainPage.getTablets();
    }
}
