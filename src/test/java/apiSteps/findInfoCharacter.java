package apiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class findInfoCharacter {
    public static String charId;
    public static String charName;
    public static String charLocation;
    public static int charEpisode;
    public static String charStatus;
    public static String charGender;
    public static String charSpecies;
    public static void infoCharacters(String id) {
        Response infoCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        charId = new JSONObject(infoCharacter.getBody().asString()).get("id").toString();
        charName = new JSONObject(infoCharacter.getBody().asString()).get("name").toString();
        charGender = new JSONObject(infoCharacter.getBody().asString()).get("gender").toString();
        charSpecies = new JSONObject(infoCharacter.getBody().asString()).get("species").toString();
        charLocation = new JSONObject(infoCharacter.getBody().asString()).getJSONObject("location").get("name").toString();
        charEpisode = (new JSONObject(infoCharacter.getBody().asString()).getJSONArray("episode").length());
        charStatus = new JSONObject(infoCharacter.getBody().asString()).get("status").toString();
        System.out.println("Информация о персонаже:");
        System.out.println("id - " + charId);
        System.out.println("Имя - " + charName);
        System.out.println(("Пол - " + charGender));
        System.out.println("Расса - " + charSpecies);
        System.out.println("Локация - " + charLocation);
        System.out.println("Количество эпизодов - " + charEpisode);
        System.out.println("Статус - " + charStatus);
    }
}
