package steps.AdidasWeb;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.PageReferences;

public class MenuSteps extends PageReferences {


    @When("^Customer clicks on \"([^\"]*)\" menu$")
    public void clickOnMenu(String menuOption) {
        menuPage.clickMenuOption(menuOption);
    }

}
