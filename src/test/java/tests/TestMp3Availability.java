package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

/**
 * Scenario:
 * 1) Navigates to MP3 tab
 * 2) Loops and check item status and prints it out
 */

public class TestMp3Availability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testMp3Availability() {
        mainPage.getMP3Players();
        mainPage.checkListOfMP3Players();
    }
}
