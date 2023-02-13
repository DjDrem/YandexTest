package pageSteps;

import io.qameta.allure.Step;

import static pageElements.CurrentTasksElements.*;
import static pageElements.DashboardElements.taskSearch;
import static pageElements.DashboardElements.tasksTab;

public class CurrentTasksSteps {
    @Step
    public static void numberTask (){
        tasksTab.click();
        taskSearch.click();
        String number = numberRunningTask.getText();
        System.out.println(number);
    }
}
