package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import pages.AdidasWeb.*;
import steps.AdidasWeb.PurchaseFormSteps;

public class PageReferences extends PageObject {

    @Managed(driver = "chrome")
    public static WebDriver driver;

    /*@Managed(driver = "chrome")
    public static WebDriver chromeDriver;*/

    @Steps
    public BrowseProductsPage browseProductsPage;
    public ProductPage productPage;
    public CartPage cartPage;
    public PurchaseFormPage purchaseFormPage;
    public MenuPage menuPage;

}
