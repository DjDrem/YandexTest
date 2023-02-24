package restAPI;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class runApi {
    public static String charId;
    public static void getCharacter(){
        Response GetCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" )
                .then()
//                .log()
//                .all()
                .extract()
                .response();
//        charId = new JSONObject(GetCharacter.getBody().asString()).getJSONArray("results").getJSONObject(0).get("id").toString();
        charId = new JSONObject(GetCharacter.getBody().asString()).getJSONArray("results").getJSONObject(0).get("name").toString();

        System.out.println(charId);
    }
}
