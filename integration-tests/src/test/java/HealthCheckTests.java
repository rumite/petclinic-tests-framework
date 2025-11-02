import config.Config;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class HealthCheckTests extends BaseTest {
    @Test
    public void apiGatewayHealth() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.get(Config.API_GATEWAY_URL + "/actuator/health")
            .then()
            .statusCode(200);
    }

    @Test
    public void customerServiceHealth() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.get(Config.CUSTOMER_SERVICE_URL + "/actuator/health")
            .then()
            .statusCode(200);
    }

    @Test
    public void visitsServiceHealth() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.get(Config.VISITS_SERVICE_URL + "/actuator/health")
            .then()
            .statusCode(200);
    }

    @Test
    public void vetsServiceHealth() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.get(Config.VETS_SERVICE_URL + "/actuator/health")
            .then()
            .statusCode(200);
    }

    @Test
    public void adminServerHealth() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.get(Config.ADMIN_SERVER_URL + "/actuator/health")
            .then()
            .statusCode(200);
    }
}


