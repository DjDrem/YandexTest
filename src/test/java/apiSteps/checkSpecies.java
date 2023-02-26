package apiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;

import static apiSteps.findInfoCharacter.charId;
import static io.restassured.RestAssured.given;

public class checkSpecies {
    public static String firstSpecies;
    public static String secondSpecies;
    public static void chekingSpesies(String id, String lastId){
        Response speciesFirst = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        firstSpecies = new JSONObject(speciesFirst.getBody().asString()).get("species").toString();
        Response speciesSecond = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + lastId)
                .then()
                .extract()
                .response();
        secondSpecies = new JSONObject(speciesSecond.getBody().asString()).get("species").toString();
        System.out.println("Проверка рассы персонажей");
        System.out.println("Первый " + firstSpecies + " второй " + secondSpecies);
    }
}
