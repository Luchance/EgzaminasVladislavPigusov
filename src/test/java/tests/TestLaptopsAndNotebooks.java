package tests;

import org.junit.Test;
import page.WebElementsPage;
import setup.SetUp;

public class TestLaptopsAndNotebooks extends SetUp {
    WebElementsPage mainPage = new WebElementsPage(driver);

    @Test
    public void testLaptopsAndNotebooks() {
        mainPage.getLaptopsAndNotebooks();
        mainPage.checkListOfLaptopsAndNotebooks();
    }
}
