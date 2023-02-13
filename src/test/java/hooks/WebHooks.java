package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import static com.codeborne.selenide.Selenide.open;

/*
 * Класс менеджер с настройками драйверов(браузеров)
 */

public abstract class WebHooks {
    @Before
    public void openJira() {
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
    }

    @After
    public void closeJira() {
        Selenide.closeWebDriver();
    }
}
