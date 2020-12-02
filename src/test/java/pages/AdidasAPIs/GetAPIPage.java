package pages.AdidasAPIs;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import common.FileUtils;
import common.Keywords;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetAPIPage extends Keywords {

    private static Logger logger = LoggerFactory.getLogger(GetAPIPage.class);
    List<String> petsList=new ArrayList<String>();
    Response response;

    public List<String> getPetsWithStatus(String status) throws Exception {
        baseURI = FileUtils.getValueFromProperty("apiDetails.properties","petBasepath");
        basePath = FileUtils.getValueFromProperty("apiDetails.properties","getPetStatusBaseURI")+"?status="+status;
        logger.info("Basepath is "+baseURI+basePath);
        response = given().headers("accept","application/json").when().get();
        int statusCode=response.getStatusCode();
        Assert.assertEquals("Failed to get list of pets",200,statusCode);
        JsonPath jsonPathEvaluator=response.jsonPath();//.toJSONString();
        petsList=jsonPathEvaluator.getList("[0].name");
        String jsonString=response.toString();
        List<String> list = response.jsonPath().getJsonObject("[0].name");

        //JSONObject myResponse = jsonObject.getJSONObject("name");
        JSONObject obj1=new JSONObject();
        String str=obj1.toJSONString();

        /*JsonObject jo = new JsonParser().parse(".").getAsJsonObject();
        JsonArray ja = jo.getAsJsonArray("name");
*/
        /*ObjectMapper obj=
            obj.writeObjectAsString()*/
        //JSONArray ja=(JSONArray) jo.get("name");
        /*System.out.println(ja.size());*/
        // iterating phoneNumbers
        /*Iterator itr2 = ja.iterator();

        while (itr2.hasNext())
        {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }*/

        //petsList=jsonPathEvaluator.getJsonObject("name");
        //Map<String, String> petsMap = jsonPathEvaluator.getMap("");
        //petsList=jsonPathEvaluator.get("$[*].name");

        logger.info("Successfully retrieved pets with status "+status);
        return petsList;
    }

    public void verifyPetInPetsListWithStatus(String petName, String flag, String status) {
    }
}
