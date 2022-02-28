package Training;

import static io.restassured.RestAssured.responseSpecification;
import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class AppTest {

    @Before
    public void setup() {
        RestAssured.baseURI = "https://api.themoviedb.org/3/";
    }

    //Token Request
    @Test
    public void getRequestToken() {
        given().when().get("/authentication/token/new?api_key=8c593d3066228bad68a7d2340be73694").then().log().body().and().statusCode(200);

    }

   @Test
   public void getStatusCode(){
   int statusCode = given().when().get().getStatusCode();
   System.out.println("Status Code :"+statusCode);
   }

    @Test
    public void getHeaders(){
        given().when().get().then().log().headers();
    }

}




