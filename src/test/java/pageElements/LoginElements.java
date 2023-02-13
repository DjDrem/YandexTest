package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginElements {
    public static SelenideElement loginEdujira = $x ("//input[@name = 'os_username']");
    public static SelenideElement passwordEdujira = $x ("//input[@name = 'os_password']");
    public static SelenideElement entryEdujira = $x ("//input[@value = 'Войти']");
}
