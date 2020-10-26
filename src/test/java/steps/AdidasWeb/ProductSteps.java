package steps.AdidasWeb;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.PageReferences;

public class ProductSteps extends PageReferences {

    @Then("^Customer navigates to the \"([^\"]*)\" product page$")
    public void customerNavigatesToTheProductPage(String productName) {
        productPage.verifyProductInHeader(productName);
    }

    @Then("^Customer adds the products to the cart$")
    public void customerAddsTheProductsToTheCart() {
        productPage.clickAddToCart();
    }

    @Then("^Customer accepts the confirmation alert$")
    public void customerAcceptsTheConfirmationAlert() {
        productPage.acceptConfirmationAlert();
    }

    @When("^Customer navigates back$")
    public void customerNavigatesBack() {
        productPage.navigateBackToBrowsePage();
    }
}
