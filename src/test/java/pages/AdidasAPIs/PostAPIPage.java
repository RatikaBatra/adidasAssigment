package pages.AdidasAPIs;

import common.FileUtils;
import common.Keywords;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class PostAPIPage extends Keywords {

    public void addNewPet(String petName) throws Exception {
        baseURI= FileUtils.getValueFromProperty("apiDetails.properties","petBasepath");
        basePath="";
        //Response response=given().headers("Content-Type","application/json")

    }
}
