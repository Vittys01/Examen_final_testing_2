package RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class testOverviewAccount {
    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/customers/22313/accounts";
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