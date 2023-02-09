package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class PageObjectElements {
    public static SelenideElement loginEdujira = $x ("//input[@name = 'os_username']");
    public static SelenideElement passwordEdujira = $x ("//input[@name = 'os_password']");
    public static SelenideElement entryEdujira = $x ("//input[@value = 'Войти']");
    public static SelenideElement projectEdujira = $x ("//a[@accesskey = 'I']");
    public static SelenideElement task = $x ("//a[text() = 'Текущий поиск']");
    public static SelenideElement numberRunningTask = $x ("//span[contains(text(), '1 из')]");
    public static SelenideElement searchTask = $x ("//input[@placeholder = 'Содержит текст']");
    public static SelenideElement searchButton = $x ("//button[text() = 'Поиск']");
    public static SelenideElement taskSelenium = $x ("//span[text() = 'TestSelenium']");
    public static SelenideElement statusProject = $x ("///span[@class = 'value']//child::span");




}
