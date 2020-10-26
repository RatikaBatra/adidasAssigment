package pages.AdidasWeb;

import common.Keywords;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Keywords {

    @FindBy(linkText = "Add to cart")
    private WebElementFacade addToCartButton;

    private String productInHeader = "//h2[text()='%s']";

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void acceptConfirmationAlert() {
        acceptAlert();
    }

    public void navigateBackToBrowsePage() {
        navigateBack();
    }

    public void verifyProductInHeader(String product) {
        String formattedProducInHeader=String.format(productInHeader,product);
        verifyVisibility(formattedProducInHeader);
    }

}
