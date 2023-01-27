import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
//we will use JSON object here for sending the body and
// Json is responsible for sending the data from client to server

public class post2method {
    @Test
    public void pst(){
        JSONObject obj = new JSONObject();
obj.put("name", "morpheus");
obj.put( "job", "leader");
given()

        .header("content-Type","application/json")
        .body(obj.toString())
        .when()
        .post("https://reqres.in/api/users")
        .then().assertThat().statusCode(201);
        System.out.println("all done");
    }
    //for practice post with Json body
    @Test
    public void p(){
        JSONObject obj1 = new JSONObject();
        obj1.put("email", "eve.holt@reqres.in");
        obj1.put(   "password", "cityslicka");

        given()
                .header("content-Type","application/Json")
                .body(obj1.toString())
                .when()
                .post("https://reqres.in/api/login")
                .then().log().all();
        System.out.println("good");

    }
}
