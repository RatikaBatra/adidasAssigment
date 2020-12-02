package steps.AdidasAPIs;

import io.cucumber.java.en.Then;
import steps.PageReferences;

public class PutAPISteps extends PageReferences {

    @Then("^User makes a PUT request to update status of pet \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userMakesAPUTRequestToUpdateStatusOfPetTo(String petName, String newStatus) {
        putAPIPage.updatePetStatus(petName,newStatus);
    }

}
