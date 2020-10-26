package common;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords extends PageObject {

    public void openUrlWithHistory(String url){
        //System.setProperty("webdriver.chrome.driver","D://Projects//chromedriver_win321//chromedriver.exe");
        getDriver().navigate().to(url);
    }

    public void maximizeWindow(){
        getDriver().manage().window().maximize();
    }

    public void acceptAlert(){
        WebDriverWait wait=new WebDriverWait(getDriver(),5);
        wait.until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();
    }

    public void navigateBack(){
        getDriver().navigate().back();
    }

    public void clickElement(String xpathOrCssSelector){
        try{
            findBy(xpathOrCssSelector).waitUntilVisible().click();
        }catch (StaleElementReferenceException e){
            clickElement(xpathOrCssSelector);
        }
    }

    public void verifyVisibility(String xpathOrCssSelector) {
        waitABit(3000);
        try{
            findBy(xpathOrCssSelector).shouldBeVisible();
        }catch (StaleElementReferenceException e){
            verifyVisibility(xpathOrCssSelector);
        }
    }


}
