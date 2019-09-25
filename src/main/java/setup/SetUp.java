package setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Abstract class for many tests to use for starting up
 */

public abstract class SetUp {

    protected static WebDriver driver;

    /**
     * This class needed for test's set up
     * Configures chrome driver for selenium, opens Chrome, maximizes window and navigates to web page
     */

    @BeforeClass
    public static void setUpBrowser(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://141.136.44.216:8080/kodas-spring-1.0-SNAPSHOT");
    }

    /**
     * After class that shuts down chrome browser after test completion
     */

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
