import config.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class OwnersTest {
    @Test
    public void getOwnerByIdTest() {
        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.baseUri(Config.API_GATEWAY_URL)
            .basePath("/api/gateway/owners/{userId}")
            .pathParam("userId", 1)
            .get();

        System.out.println(response.asString());
    }
}
