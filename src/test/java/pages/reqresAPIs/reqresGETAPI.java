package pages.reqresAPIs;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.*;

public class reqresGETAPI {

    @Test
    public void listUser(){
        //RestAssured.get("https://reqres.in/api/users?page=2").then().log().all().statusCode(200);
        Response response=given().when().get("https://reqres.in/api/users?page=2");
        System.out.println("Output for response methods: ");
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("Content-Type"));
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getTime());
        System.out.println(response.getTimeIn(TimeUnit.SECONDS));

        given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.first_name",hasItems("Byron","Rachel1"));

    }

}
