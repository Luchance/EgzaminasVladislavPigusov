package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

public class TestMp3Availability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testMp3Availability() {
        mainPage.getMP3Players();
        mainPage.checkListOfMP3Players();
    }
}
