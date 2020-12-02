package steps.AdidasAPIs;

import io.cucumber.java.en.When;
import steps.PageReferences;

public class PostAPISteps extends PageReferences {

    @When("^User makes a POST request to add a new pet \"([^\"]*)\"$")
    public void userMakesAPOSTRequestToAddANewPet(String petName) throws Exception {
        postAPIPage.addNewPet(petName);
    }

}
