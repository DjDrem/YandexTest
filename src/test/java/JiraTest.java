import com.codeborne.selenide.Condition;
import hooks.WebHooks;
import org.junit.Assert;
import org.junit.Test;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static pageElements.BagElements.openTask;
import static pageElements.CurrentTasksElements.numberRunningTask;
import static pageElements.DashboardElements.*;
import static pageElements.TestSeleniumElements.*;
import static pageSteps.BagSteps.createBag;
import static pageSteps.CurrentTasksSteps.numberTask;
import static pageSteps.DashboardSteps.testProject;
import static pageSteps.LoginSteps.loginJira;
import static pageSteps.TestSeleniumSteps.statusCheck;


public class JiraTest extends WebHooks {
    private String login = "nkiselev";
    private String password = "Qwerty123";
    private String nameTask = "TestSelenium";
    private String theme = "Поломка запуска тестов";
    private String description = "Неудачный запуск и падение всех тестов";
    private String environnment = "MacOS , GoogleChrome Версия 110.0.5481.77 (Официальная сборка), (arm64) ";

    @Test
    public void LoginTest(){
        loginJira(login, password);
        desktopTab.shouldBe(Condition.visible, Duration.ofSeconds(3));
        Assert.assertEquals("Проекты", projectTab.getText());
        sleep(2000);
    }

    @Test
    public void ProjectTest(){
        loginJira(login, password);
        testProject();
        numberRunningTask.shouldBe(Condition.exist);
        Assert.assertEquals("1 из ...", numberRunningTask, numberRunningTask);
        sleep(2000);
    }

    @Test
    public void totalNumberTask (){
        loginJira(login, password);
        numberTask();
        String count = numberRunningTask.getText();
        Assert.assertEquals("Всего задач: ", numberRunningTask.getText(), count);
        sleep(2000);
    }

    @Test
    public void statusCheckTask(){
        loginJira(login, password);
        statusCheck(nameTask);
        Assert.assertEquals("Привязка к Version 2.0", "Version 2.0", versionBinding.getText());
    }

    @Test
    public void bugCreate(){
        loginJira(login, password);
        createBag(theme, description, environnment);
        tasksTab.click();
        openTask.click();
        sleep(2000);
        Assert.assertEquals("Сделать", statusTask.getValue());
    }
}
