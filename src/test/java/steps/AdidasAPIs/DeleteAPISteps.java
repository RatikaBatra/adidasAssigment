package steps.AdidasAPIs;

import io.cucumber.java.en.When;
import steps.PageReferences;

public class DeleteAPISteps extends PageReferences {

    @When("^User makes a DELETE request to delete the pet \"([^\"]*)\"$")
    public void userMakesADELETERequestToDeleteThePet(String petName) {
        deleteAPIPage.deletePet(petName);
    }

}
