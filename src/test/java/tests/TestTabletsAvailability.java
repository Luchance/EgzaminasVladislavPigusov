package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

public class TestTabletsAvailability extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testTabletsAvailability() {
        mainPage.getTablets();
        mainPage.checkListOfTablets();
    }
}
