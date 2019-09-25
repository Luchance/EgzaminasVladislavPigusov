package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

public class TestPhonesAndPDAsAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testPhonesAndPDAsAvailability() {
        mainPage.getPhonesAndPDAs();
        mainPage.checkListOfPhonesAndPDAs();
    }
}
