package steps;

import cucumber.api.java.en.And;
import pages.ProductsPage;
import setups.DriverSetup;

public class ProductStep {
    ProductsPage productsPage = new ProductsPage(DriverSetup.getAppiumDriver());

    @And("^user click on \"([^\"]*)\"$")
    public void userClickOn(String product) {
        productsPage.clickProduct(product);
    }
}