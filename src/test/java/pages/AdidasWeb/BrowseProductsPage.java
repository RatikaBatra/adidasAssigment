package pages.AdidasWeb;

import common.Keywords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrowseProductsPage extends Keywords {

    Logger logger= LoggerFactory.getLogger("BrowseProductsPage.class");

    //String productType = "//a[@class='list-group-item'][text()='%s']");
    private String productOrProductType="//a[text()='%s']";

    public void openLink(String url) {
        openUrlWithHistory(url);
        maximizeWindow();
        logger.info("Opened the home page");
    }

    public void clickProduct(String product) {
        String formattedProductOrProductType=String.format(productOrProductType,product);
        clickElement(formattedProductOrProductType);
        logger.info("clicked the product "+product);
    }
}
