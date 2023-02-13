package pageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TestSeleniumElements {
    public static SelenideElement testSelenium = $x ("//span[text() = 'TestSelenium']");
    public static SelenideElement statusTask = $x ("//span[@id = 'status-val']");
    public static SelenideElement versionBinding  = $x ("//strong[@title = 'Затронуты версии']//following-sibling::span");
}
