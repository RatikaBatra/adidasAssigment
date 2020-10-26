package steps.AdidasWeb;

import io.cucumber.java.en.Given;
import steps.PageReferences;

public class BrowseProductsSteps extends PageReferences {

    @Given("^Customer opens \"([^\"]*)\" homepage$")
    public void openLink(String url){
        browseProductsPage.openLink(url);
    }

    @Given("^Customer clicks on \"([^\"]*)\" product([^\"]*)$")
    public void browseProduct(String product, String isCategory){
        browseProductsPage.clickProduct(product);
    }

}
