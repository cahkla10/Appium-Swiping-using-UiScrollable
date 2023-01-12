package steps;

import cucumber.api.java.en.Then;
import pages.ProductDetailPage;
import pages.ProductsPage;
import setups.DriverSetup;

public class CommonStep {
    ProductDetailPage productDetailPage = new ProductDetailPage(DriverSetup.getAppiumDriver());
    ProductsPage productsPage = new ProductsPage(DriverSetup.getAppiumDriver());

    @Then("^user redirected to \"([^\"]*)\" page$")
    public void userRedirectedTo(String expectedTitlePage) {
        switch (expectedTitlePage){
            case "PRODUCTS":
                productsPage.readTitlePage(expectedTitlePage);
                break;
            case "BACK TO PRODUCTS":
                productDetailPage.readTitlePage(expectedTitlePage);
                break;
        }
    }
}