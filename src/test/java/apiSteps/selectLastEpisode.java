package apiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class selectLastEpisode {
    public static int lastEpisode;
    public static void selectEpisode(String id) {
        Response gettingLastEpisode = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        int episode = (new JSONObject(gettingLastEpisode.getBody().asString()).getJSONArray("episode").length() - 1);
        lastEpisode = Integer.parseInt(new JSONObject(gettingLastEpisode.getBody().asString())
                .getJSONArray("episode").get(episode).toString().replaceAll("[^0-9]", ""));
        System.out.println("Последний эпизод с участием - " + lastEpisode);
    }
}
