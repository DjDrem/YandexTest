package pageSteps;

import io.qameta.allure.Step;
import static pageElements.LoginElements.*;

public class LoginSteps {
    @Step
    public static void loginJira (String login, String password){
        loginEdujira.sendKeys(login);
        passwordEdujira.sendKeys(password);
        entryEdujira.click();
    }
}
