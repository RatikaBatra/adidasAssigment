package pages.AdidasWeb;

import common.Keywords;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductPage extends Keywords {

    Logger logger= LoggerFactory.getLogger("ProductPage.class");

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
        logger.info("successfully navigated to correct product page");
    }

}
