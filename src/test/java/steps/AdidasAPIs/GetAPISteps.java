package steps.AdidasAPIs;

import io.cucumber.java.en.Given;
import steps.PageReferences;

import java.util.ArrayList;
import java.util.List;

public class GetAPISteps extends PageReferences {

    @Given("^User makes a GET request to get all the pets with \"([^\"]*)\" status$")
    public void userMakesAGETRequestToGetAllThePetsWithStatus(String status) throws Exception {
        getAPIPage.getPetsWithStatus(status);
    }

    @Given("^User verify that pet \"([^\"]*)\" (is not|is) in \"([^\"]*)\" pets list$")
    public void userVerifyThatPetIsNotInPetsList(String petName, String flag,String status) {
        getAPIPage.verifyPetInPetsListWithStatus(petName,flag,status);
    }

}
