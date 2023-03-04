package apiSteps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;

public class loginJira {
    @Step("Авторизация пользователя в jira")
    public static void jiraLogin() {
        Response loginUser = given()
                .baseUri("https://edujira.ifellow.ru/rest/auth/1/session")
                .header("Content-type", "application/json")
                .auth()
                .preemptive()
                .basic("nkiselev", "Qwerty123")
                .when()
                .get()
                .then()
                .extract()
                .response();
        String userInfo = new JSONObject(loginUser.getBody().asString()).get("name").toString();
        String loginTimeInfo = new JSONObject(loginUser.getBody().asString()).getJSONObject("loginInfo")
                .get("previousLoginTime").toString();
        String selfInfo = new JSONObject(loginUser.getBody().asString()).get("self").toString();
        System.out.println("Авторизованный пользователь: " + userInfo);
        System.out.println("Время авторизации: " + loginTimeInfo);
        System.out.println(selfInfo);
    }
}
