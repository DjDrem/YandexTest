package apiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class loginJira {
    private static String requestBody = "{\n" +
            "  \"username\": \"nkiselev\",\n" +
            "  \"password\": \"Qwerty123\" \n}";
    public static void jiraLogin() throws IOException {
        Response loginUser = given()
                .baseUri("https://edujira.ifellow.ru/rest/auth/1/session")
                .header("Content-type","application/json")
                .body(requestBody)
                .when()
                .get()
                .then()
                .extract()
                .response();
        String login = new JSONObject(loginUser.getBody().asString()).toString();
        System.out.println(login);
    }
}
