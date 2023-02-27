package apiSteps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class rickAndMorty {
    public static String charId;
    public static String charName;
    public static String charLocation;
    public static int charEpisode;
    public static String charStatus;
    public static String charGender;
    public static String charSpecies;
    public static int lastEpisode;
    public static String charLastId;
    public static String charLastName;
    public static String charLastSpecies;
    public static String charLastLocation;
    public static int idCharacter;
    public static void findInformationCharacter(String id){
        RequestSpecification reqSpecFirst = new RequestSpecBuilder()
                .setBaseUri("https://rickandmortyapi.com/api")
                .build();

        Response infoCharacter = given()
                .spec(reqSpecFirst)
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
    public static void selectEpisode() {
        RequestSpecification reqSpecSecond = new RequestSpecBuilder()
                .setBaseUri("https://rickandmortyapi.com/api")
                .build();

        Response gettingLastEpisode = given()
                .spec(reqSpecSecond)
                .when()
                .get("/character/" + charId)
                .then()
                .extract()
                .response();
        int episode = (new JSONObject(gettingLastEpisode.getBody().asString()).getJSONArray("episode").length() - 1);
        lastEpisode = Integer.parseInt(new JSONObject(gettingLastEpisode.getBody().asString())
                .getJSONArray("episode").get(episode).toString().replaceAll("[^0-9]", ""));
        System.out.println("Последний эпизод с участием - " + lastEpisode);
    }
    public static void gettingLastCharacterID(){
        RequestSpecification reqSpecThird = new RequestSpecBuilder()
                .setBaseUri("https://rickandmortyapi.com/api")
                .build();

        Response gettingCharacter = given()
                .spec(reqSpecThird)
                .when()
                .get("/episode/" + lastEpisode)
                .then()
                .extract()
                .response();
        int lastCharacter = (new JSONObject(gettingCharacter.getBody().asString()).getJSONArray("characters").length()-1);
        idCharacter = Integer.parseInt(new JSONObject(gettingCharacter.getBody().asString()).getJSONArray("characters")
                .get(lastCharacter).toString().replaceAll("[^0-9]", ""));
    }
    public static void infoLastCharacters(){
        RequestSpecification reqSpecThirdFourth = new RequestSpecBuilder()
                .setBaseUri("https://rickandmortyapi.com/api")
                .build();

        String characterId = Integer.toString(idCharacter);
        Response infoLastCharacter = given()
                .spec(reqSpecThirdFourth)
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
