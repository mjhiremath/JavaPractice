package workshop;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GetTest {

    @Test
    public void verifyListUserResponseTime(){
        ResponseBody response = RestAssured.given()
                .baseUri("https://reqres.in")
                .param("path", 2)
                .get("/api/users")
                .then()
                .statusCode(200)
                .extract()
                .response();
        String page_number = response.jsonPath().get("data[0].email");
        assertEquals(page_number,"george.bluth@reqres.in");
        System.out.println(response.prettyPrint());
    }
}
