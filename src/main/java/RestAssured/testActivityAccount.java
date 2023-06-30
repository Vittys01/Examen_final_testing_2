package RestAssured;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class testActivityAccount {
    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/accounts/13566/";
    Response response = given().auth()
            .basic("Vittys2", "123456")
            .when()
            .get(URL);

    @Test
    public void Test01() {

        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
}
