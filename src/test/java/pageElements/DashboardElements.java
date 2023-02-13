package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class DashboardElements {
//    Вкладка Рабочий стол
    public static SelenideElement desktopTab = $x ("//a[@accesskey = 'D']");
//   Вкладка Проекты
    public static SelenideElement projectTab = $x ("//a[@accesskey = 'P']");
    public static SelenideElement weavingProject = $x ("//a[contains(text(), 'Test')]");
//    Вкладка Задачи
    public static SelenideElement tasksTab = $x ("//a[@accesskey = 'I']");
    public static SelenideElement weavingSearch = $x ("//a[contains(text(), 'Текущий поиск')]");
    public static  SelenideElement taskSearch = $x ("//a[contains(text(), 'Поиск задач')]");
//    Вкладка Доски
    public static SelenideElement boardsTab = $x ("//a[contains(@title, 'Управление')]");
//    Кнопка Создать
    public static  SelenideElement createButton = $x ("//a[text() = 'Создать']");
//    Строка Поиск
    public static  SelenideElement searchField = $x ("//input[@placeholder = 'Поиск']");
//
}
