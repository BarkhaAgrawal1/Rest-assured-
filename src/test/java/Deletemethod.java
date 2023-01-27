import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Deletemethod {

    @Test
    public void del(){
        Response res1 = RestAssured.delete("https://reqres.in/api/users?page=2");
                given()
                        .when()
                        .delete("https://reqres.in/api/users?page=2")
                        .then().extract().statusCode();
        System.out.println(res1.asPrettyString());
        System.out.println(res1.getStatusLine());
    }
   @Test
   public void del2(){
        Response res2 = given()
                .when()
                .delete("https://reqres.in/api/users?page=2")
                .then().extract().response();
       System.out.println(res2.getStatusCode());




   }



}
