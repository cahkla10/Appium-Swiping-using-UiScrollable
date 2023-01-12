package steps;

import cucumber.api.java.en.Then;
import pages.ProductDetailPage;
import pages.ProductsPage;
import setups.DriverSetup;

public class ProductDetailStep {
    ProductDetailPage productDetailPage = new ProductDetailPage(DriverSetup.getAppiumDriver());

    @Then("^user read product \"([^\"]*)\" detail is appear$")
    public void userReadProduct(String productDetail) {
        productDetailPage.readProduct(productDetail);
    }
}