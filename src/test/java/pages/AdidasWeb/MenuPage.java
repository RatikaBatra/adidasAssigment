package pages.AdidasWeb;

import common.Keywords;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuPage extends Keywords {

    Logger logger= LoggerFactory.getLogger("MenuPage.class");
    //String menuOption="//a[contains(text(),'%s')]";
    /*@FindBy(xpath="//a[@class='nav-link']")
    private WebElementFacade menuOption;*/

    @FindBy(xpath="//a[@class='nav-link'][1]")
    private WebElementFacade homeMenu;

    @FindBy(xpath="//a[@class='nav-link'][1]")
    private WebElementFacade cartMenu;

    String menu="//div[@class='container']//a[@class='nav-link'][contains(text(),'%s')]";

    public void clickMenuOption(String option) {
        //clickElement(menuOption);
        /*WebElementFacade element=findBy(menuOption);
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();",element);*/
        /*if(option.equalsIgnoreCase("home"))
            homeMenu.click();
        else if(option.equalsIgnoreCase("cart"))
            cartMenu.click();
        else
            homeMenu.click();*/
        clickElement(menu);
        waitABit(5000);
    }
}
