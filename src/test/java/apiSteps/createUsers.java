package apiSteps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class createUsers {

    private static RequestSpecification reqSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/api")
            .build();
    public static void userCreate() throws IOException {
        JSONObject body = new JSONObject(new String(Files.readAllBytes(Paths.get("src/test/resources/json/api.json"))));
        body.put("name", "Tomato");
        body.put("job", "Eat maket");
        Response sendJson = given()
                .header("Content-type","application/json")
                .spec(reqSpec)
                .body(body.toString())
                .when()
                .put("/users/")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println("Проверка валидные данные по значениям key и value");
        Assert.assertEquals("Неудача", (new JSONObject(sendJson.getBody().asString()).get("name")), (body.get("name")));
        Assert.assertEquals("Неудача", (new JSONObject(sendJson.getBody().asString()).get("job")), (body.get("job")));
    }
}
