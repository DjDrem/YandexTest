package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BagElements {
//    Проект
    public static SelenideElement projectBag = $x ("//label[@for = 'project-field']//child::span[@aria-hidden]");
//    Тип задачи
    public static SelenideElement taskType = $x ("//label[text() = 'Тип задачи ']//following-sibling::div//child::input");
    public static SelenideElement bugTheme = $x ("//label[@for = 'summary']//following-sibling::input");
//    Описание
    public static SelenideElement descriptionBug = $x ("(//iframe)[2]");
    public static SelenideElement buttonTextDescription = $x ("(//button[text() = 'Текст'])[1]");
//    Окружение
    public static SelenideElement environmentBug = $x ("(//iframe)[3]");
//    Компоненты
    public static SelenideElement componentsBug = $x ("//label[text() = 'Компоненты']//following-sibling::span");
//    Создать
    public static SelenideElement createButon = $x ("//input[@accesskey = 'S']");
}
