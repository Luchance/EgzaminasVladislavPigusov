package page;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Storage for most used WebElements that are static, used in many tests for fast execution
 * Functions that are reusable in many tests
 */

public class WebElementsPage extends AbstractPage{
    SoftAssertions softAssertions = new SoftAssertions();

    public WebElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Desktops")
    private WebElement desktops;

    @FindBy(linkText = "Laptops & Notebooks")
    private WebElement laptopsAndNotebooks;

    @FindBy(linkText = "Tablets")
    private WebElement tablets;

    @FindBy(linkText = "Phones & PDAs")
    private WebElement phonesAndPDAs;

    @FindBy(linkText = "Cameras")
    private WebElement cameras;

    @FindBy(linkText = "MP3 Players")
    private WebElement mp3Players;

    @FindBy(xpath = "//body[@class='product-category-18']/div[@class='container']/div[@class='row']/div[@id='content']/div[4]//div[@class='image']")
    private List<WebElement> listOfLaptops;
    @FindBy(xpath = "//body[@class='product-category-34']/div[@class='container']/div[@class='row']/div[@id='content']/div[4]//div[@class='image']")
    private List<WebElement> listOfMp3;

    @FindBy(xpath = "//body[@class='product-category-24']/div[@class='container']/div[@class='row']/div[@id='content']/div[2]//div[@class='image']")
    private List<WebElement> listOfPhones;
    @FindBy(xpath = "//body[@class='product-category-57']/div[@class='container']/div[@class='row']/div[@id='content']/div[2]//div[@class='image']")
    private List<WebElement> listOfTablets;
    @FindBy(xpath = "//body[@class='product-category-33']/div[@class='container']/div[@class='row']/div[@id='content']/div[2]//div[@class='image']")
    private List<WebElement> listOfCameras;

    @FindBy(xpath = "//li[contains(text(),'Availability:')]")
    private WebElement availabilityInfo;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]")
    private WebElement productName;



    public void getDesktops(){
        desktops.click();
    }
    public void getLaptopsAndNotebooks(){
        laptopsAndNotebooks.click();
    }
    public void getTablets(){
        tablets.click();
    }
    public void getPhonesAndPDAs(){
        phonesAndPDAs.click();
    }
    public void getCameras(){
        cameras.click();
    }
    public void getMP3Players(){
        mp3Players.click();
    }

    public String getAvailabilityInfoMessage() {
        return availabilityInfo.getText().replace("Availability: ", "");
    }

    public void checkAvailability() {
        if (getAvailabilityInfoMessage().equals("In Stock")) {
            Assert.assertEquals("Product is not available", "In Stock", getAvailabilityInfoMessage());
            System.out.println("Product "+ getProductName() + " is available");
        } else {
            System.out.println("Product " + getProductName() + " availability is " + getAvailabilityInfoMessage());
        }
    }

    public String getProductName() {
        return productName.getText();
    }

    public List<String> checkListOfLaptopsAndNotebooks() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listOfLaptops.size(); i++) {
            listOfLaptops.get(i).click();
            checkAvailability();
            getLaptopsAndNotebooks();
        }
        return list;
    }

    public List<String> checkListOfCameras() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listOfCameras.size(); i++) {
            listOfCameras.get(i).click();
            checkAvailability();
            getCameras();
        }
        return list;
    }

    public List<String> checkListOfMP3Players() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listOfMp3.size(); i++) {
            listOfMp3.get(i).click();
            checkAvailability();
            getMP3Players();
        }
        return list;
    }

    public List<String> checkListOfPhonesAndPDAs() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listOfPhones.size(); i++) {
            listOfPhones.get(i).click();
            checkAvailability();
            getPhonesAndPDAs();
        }
        return list;
    }

    public List<String> checkListOfTablets() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listOfTablets.size(); i++) {
            listOfTablets.get(i).click();
            checkAvailability();
            getTablets();
        }
        return list;
    }

}
