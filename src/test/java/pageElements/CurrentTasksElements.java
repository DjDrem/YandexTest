package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CurrentTasksElements {
    public static SelenideElement numberRunningTask = $x ("//span[contains(text(), '1 из')]");
    public static SelenideElement searchTask = $x ("//input[@placeholder = 'Содержит текст']");
    public static SelenideElement searchButton = $x ("//button[text() = 'Поиск']");
}
