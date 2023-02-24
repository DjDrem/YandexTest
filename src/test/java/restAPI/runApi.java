package restAPI;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class runApi {
    public static void getCharacter(){
        Response GetCharacter = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" )
                .then()
                .log()
                .all()
                .extract()
                .response();
    }
}
