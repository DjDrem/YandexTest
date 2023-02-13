package pageSteps;

import io.qameta.allure.Step;
import static pageElements.CurrentTasksElements.*;
import static pageElements.DashboardElements.taskSearch;
import static pageElements.DashboardElements.tasksTab;
import static pageElements.TestSeleniumElements.statusTask;
import static pageElements.TestSeleniumElements.versionBinding;

public class TestSeleniumSteps {
    @Step
    public static void statusCheck (String input){
        tasksTab.click();
        taskSearch.click();
        searchTask.sendKeys(input);
        searchButton.click();
        statusTask.click();
        String status = statusTask.getText();
        System.out.println("Статус проекта: " + status);
        String version = versionBinding.getText();
        System.out.println("Затронуты версии: " + version);
    }
}
