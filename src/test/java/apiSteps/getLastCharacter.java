package apiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;

import static apiSteps.findInfoCharacter.infoCharacters;
import static io.restassured.RestAssured.given;

public class getLastCharacter {
    public static String charLastId;
    public static String charLastName;
    public static String charLastSpecies;
    public static String charLastLocation;
    public static int idCharacter;
    public static void gettingLastCharacterID(String id){
        Response gettingCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/episode/" + id)
                .then()
                .extract()
                .response();
        int lastCharacter = (new JSONObject(gettingCharacter.getBody().asString()).getJSONArray("characters").length()-1);
        idCharacter = Integer.parseInt(new JSONObject(gettingCharacter.getBody().asString()).getJSONArray("characters")
                .get(lastCharacter).toString().replaceAll("[^0-9]", ""));
    }
    public static void infoLastCharacters(){
        String characterId = Integer.toString(idCharacter);
        Response infoLastCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + characterId)
                .then()
                .extract()
                .response();
        charLastId = new JSONObject(infoLastCharacter.getBody().asString()).get("id").toString();
        charLastName = new JSONObject(infoLastCharacter.getBody().asString()).get("name").toString();
        charLastSpecies = new JSONObject(infoLastCharacter.getBody().asString()).get("species").toString();
        charLastLocation = new JSONObject(infoLastCharacter.getBody().asString()).getJSONObject("location").get("name").toString();
        System.out.println("Информация о персонаже:");
        System.out.println("id - " + charLastId);
        System.out.println("Имя - " + charLastName);
        System.out.println("Расса - " + charLastSpecies);
        System.out.println("Локация - " + charLastLocation);
    }

}
