package pages.AdidasWeb;

import common.Keywords;

public class BrowseProductsPage extends Keywords {

    //String productType = "//a[@class='list-group-item'][text()='%s']");
    private String productOrProductType="//a[text()='%s']";

    public void openLink(String url) {
        openUrlWithHistory(url);
        maximizeWindow();
    }

    public void clickProduct(String product) {
        String formattedProductOrProductType=String.format(productOrProductType,product);
        clickElement(formattedProductOrProductType);
    }
}
