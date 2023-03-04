import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefenition"},
        tags = "@TEST"
)

public class RunnerTest {
    @BeforeClass
    public static void before(){
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().
                screenshots(true).
                savePageSource(true)
        );
    }
}
