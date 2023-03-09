package hooks;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ApiHooks implements BeforeAllCallback {
private static boolean started = false;
    @BeforeEach
    public void before(){
        if (!started) {
            started = true;
        RestAssured.filters(new AllureRestAssured());
        }
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception{
    }

    @AfterEach
    public void after(){
        WebDriverRunner.closeWebDriver();
    }
}
