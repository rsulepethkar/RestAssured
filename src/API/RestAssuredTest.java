package API;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredTest {

    @Test
    public void getPosts_shouldReturn200() {
        // Base URI
    	
    	
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        

        // Send GET request
        Response response = RestAssured
                .given()
                .when()
                .get("/posts/1")
                .then()
                .extract()
                .response();

        // Print response body
        System.out.println("Response Body: " + response.getBody().asString());

        // Assertions
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
        Assert.assertTrue(response.getBody().asString().contains("userId"), "Response should contain userId");
        
        
        JsonPath js = new JsonPath(response.asString());
        String name = js.getString("userID");
        
        
       
    }
}
