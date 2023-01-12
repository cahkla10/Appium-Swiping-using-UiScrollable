package pages;

import helpers.GlobalVariables;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductDetailPage {
    private AppiumDriver appiumDriver;

    public ProductDetailPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(appiumDriver, GlobalVariables.TIMEOUT), this);
    }

    @FindBy(xpath = "//*[@text='BACK TO PRODUCTS']")
    private List<WebElement> productDetailTitlePage;

    @FindBy(className = "android.widget.TextView")
    private List<WebElement> content;

    @FindBy(xpath = "//*[@text='ADD TO CART']")
    private WebElement addToCart;

    public void readTitlePage(String expectedTitlePage) {
        if(productDetailTitlePage.size() > 0){
            System.out.println("Page title: " + productDetailTitlePage.get(0).getText());
            assertEquals(expectedTitlePage,productDetailTitlePage.get(0).getText());
        }
    }

    public void readProduct(String productName){
        if(content.size() > 0){
            for(WebElement c : content){
                if(c.getText().contains(productName)){
                    System.out.println("Product detail: " + c.getText());
                    assertEquals(productName,c.getText());
                    break;
                }
            }
        }
    }

    public void clickAddToCart(){
        addToCart.click();
    }
}