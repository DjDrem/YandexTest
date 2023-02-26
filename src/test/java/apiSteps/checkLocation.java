package apiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class checkLocation {
    public static String firstLocation;
    public static String secondLocation;
    public static void chekingLocation(String id, String lastId){
        Response locationFirst = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        firstLocation = new JSONObject(locationFirst.getBody().asString()).getJSONObject("location").get("name").toString();
        Response locationSecond = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + lastId)
                .then()
                .extract()
                .response();
        secondLocation = new JSONObject(locationSecond.getBody().asString()).getJSONObject("location").get("name").toString();
        System.out.println("Проверка локации персонажей");
        System.out.println("Первый " + firstLocation + " второй " + secondLocation);
    }
}
