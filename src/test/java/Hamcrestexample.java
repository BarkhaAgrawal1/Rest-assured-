import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//either we can use junit or ham crest or junit for assertion
public class Hamcrestexample {

    public String ham ="https://restful-booker.herokuapp.com/booking/1";
        @Test
    public void assertion(){
            given().contentType(ContentType.JSON)
                    .when()
                    .get("ham")
                    .then().body("totalprice" ,equalTo(813) );





    }





}
