package hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;

public class WebHooks {

    @BeforeClass
    public static void before() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().
                        screenshots(true).
                        savePageSource(true)
        );
    }
//    @BeforeEach
//    public void allureParallel(){
//        Configuration.reportsFolder = "target/reports";
//        = new
//        String listenerName = "AllureSelenide";
//        new AllureSelenide().screenshots(true).
//                savePageSource(false);
//    }
//
//    @AfterEach
//    public void driverClose(){
//        WebDriverRunner.closeWebDriver();
//    }
//    @AfterEach
//    public static void after(){
//
//    }
}
