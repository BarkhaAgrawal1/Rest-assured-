import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Getmethod {
    @Test
//Normal Java method
    public void get() {

        Response res = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusCode());
        System.out.println(res.getStatusLine());
    }

    @Test
    public void get1() {

//BDD approach
        Response a = given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then().extract().response();


        System.out.println(a.getStatusCode());
        System.out.println(a.asPrettyString());
    }

//Asserting the response code as 300 so the test fails because response status code should be 200
    @Test
            public void get2(){

    given()
            .when()
            .get("https://reqres.in/api/users?page=2")
            .then().log().status().statusCode(300).assertThat().equals(200);
        System.out.println();

}



}
