import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;



//without using JSON object
public class Post {

    @Test
    public void post1(){
        given()
                .header("content-Type","application/json")
                        .body("{\n" +
                                "    \"name\": \"morpheus\",\n" +
                                "    \"job\": \"leader\"\n" +
                                "}")
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all();
        System.out.println("all well");
    }
@Test
public void postmethod(){

        Response p = RestAssured.post("https://reqres.in/api/users");
                given()
                        .header("content-Type","application/json")
                        .body("{\n" +
                                "    \"name\": \"morpheus\",\n" +
                                "    \"job\": \"leader\"\n" +
                                "}")
                        .when()
                        .post("https://reqres.in/api/users")
                        .then().assertThat().statusCode(201).equals(201);
    System.out.println("all done");
    System.out.println(p.asPrettyString());
    System.out.println(p.prettyPrint());
    System.out.println(p.getBody());
}

}