package RestAssured;

import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class testNewAccount {

    //POR GET

    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId=22313&newAccountType=1&fromAccountId=29328";
    Response response = given().auth()
            .basic("Vittys2", "123456")
            .when()
            .get(URL);
    @Test
    public void test01() {
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
    //POR POST
    @Test
    public void test02() {

                given().auth()
                .basic("Vittys2", "123456")
                .when()
                .post("https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId=22313&newAccountType=1&fromAccountId=29328")
                .then()
                .assertThat()
                .statusCode(200);
    }

}