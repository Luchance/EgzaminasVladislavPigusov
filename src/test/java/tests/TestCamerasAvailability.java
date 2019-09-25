package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

public class TestCamerasAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testCamerasAvailability() {
        mainPage.getCameras();
        mainPage.checkListOfCameras();
    }
}
