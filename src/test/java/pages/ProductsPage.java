package pages;

import helpers.Common;
import helpers.GlobalVariables;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductsPage {
    private AppiumDriver appiumDriver;

    Common common = new Common();

    public ProductsPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(appiumDriver, GlobalVariables.TIMEOUT), this);
    }

    @FindBy(xpath = "//*[@text='PRODUCTS']")
    private List<WebElement> productTitlePage;

    public void readTitlePage(String expectedTitlePage) {
        if(productTitlePage.size() > 0){
            System.out.println("Page title: " + productTitlePage.get(0).getText());
            assertEquals(expectedTitlePage, productTitlePage.get(0).getText());
        }
    }

    public void clickProduct(String product){
        common.swipeAndClick("text", product);
    }
}