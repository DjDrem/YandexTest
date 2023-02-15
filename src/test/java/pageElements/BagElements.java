package pageElements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BagElements {
//    Проект
    public static SelenideElement projectBag = $x ("//label[@for = 'project-field']//child::span[@aria-hidden]");
//    Тип задачи
    public static SelenideElement taskType = $x ("//label[text() = 'Тип задачи ']//following-sibling::div//child::input");
    public static SelenideElement bugTheme = $x ("//label[@for = 'summary']//following-sibling::input");
//    Описание
    public static SelenideElement descriptionBug = $x ("//textarea[@name = 'description']");
    public static SelenideElement buttonTextDescription = $x ("(//button[text() = 'Текст'])[1]");
//    Окружение
    public static SelenideElement environmentBug = $x ("//textarea[@id = 'environment']");
//    Компоненты
    public static SelenideElement componentsBug = $x ("//label[text() = 'Компоненты']//following-sibling::span");
//    Кнопка назначить меня
    public static SelenideElement buttonAppointMe = $x ("//button[text() = 'Назначить меня']");
//    Создать
    public static SelenideElement createButon = $x ("//input[@accesskey = 'S']");
//    Мои открытые задачи
    public static SelenideElement openTask = $x ("//a[text() = 'Мои открытые задачи']");
//    отметка в работе
    public static SelenideElement workProcees = $x ("//span[text() = 'В работе']");
//     Вкладка бизнес-процесс
    public static SelenideElement bisnessProcess = $x ("//span[text() = 'Бизнес-процесс']");
//    отметка Выполнено
    public static SelenideElement markCompleted = $x ("");
}
