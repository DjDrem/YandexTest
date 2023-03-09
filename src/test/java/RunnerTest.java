import com.codeborne.selenide.logevents.SelenideLogger;
import hooks.WebHooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefenition", "hooks"},
        tags = "@TEST",
        plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)

public class RunnerTest extends WebHooks {
}
