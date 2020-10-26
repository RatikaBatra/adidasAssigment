package common;

import steps.PageReferences;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class Hooks extends PageReferences {

    @Before("@web")
    public void beforeWeb() throws Exception {
        System.setProperty("webdriver.chrome.driver",FileUtils.getValueFromProperty("web","webdriver.chrome.driver"));
        getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    @After("@web")
    public void afterWeb(){
        getDriver().quit();
    }
}
