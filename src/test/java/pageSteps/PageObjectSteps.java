package pageSteps;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static pageElements.PageObjectElements.*;

public class PageObjectSteps {

    @Test
    public void userOpenEdujira() {
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
        loginEdujira.shouldBe(Condition.visible);
        loginEdujira.sendKeys("nkiselev");
        passwordEdujira.sendKeys("Qwerty123");
        entryEdujira.click();
        projectEdujira.shouldBe(Condition.exist);
        projectEdujira.click();
        task.shouldBe(Condition.visible);
        task.click();
        numberRunningTask.shouldBe(Condition.exist);
        String numberTask = numberRunningTask.getText();
        System.out.println(numberTask);
        searchTask.sendKeys("TestSelenium");
        searchButton.click();
        taskSelenium.shouldBe(Condition.exist);
        taskSelenium.click();
        statusProject.shouldBe(Condition.visible);

    }
}
//    @Test
//    public void userloginEdujira() {
//        loginEdujira.sendKeys("nkiselev");
//        passwordEdujira.sendKeys("Qwerty123");
//        entryEdujira.click();
//        projectEdujira.shouldBe(Condition.exist);
//    }
//
//    @Test
//    public void projectSearch() {
//        projectEdujira.click();
//        testProject.shouldBe(Condition.visible);
//    }
//
//    @Test
//    public void totalTask() {
//        testProject.click();
//        task.shouldBe(Condition.visible);
//        task.click();
//        numberRunningTask.shouldBe(Condition.exist);
//        String numberTask = numberRunningTask.getText();
//        System.out.println(numberTask);
//    }
//
//    @Test
//    public void searchTaskSelenium () {
//        taskList.click();
//        taskSelenium.shouldBe(Condition.exist);
//        taskSelenium.click();
//        statusProject.shouldBe(Condition.visible);
//    }
