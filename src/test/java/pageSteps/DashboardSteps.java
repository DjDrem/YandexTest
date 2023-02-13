package pageSteps;

import io.qameta.allure.Step;
import static pageElements.DashboardElements.*;

public class DashboardSteps {
    @Step
    public static void testProject (){
        tasksTab.click();
        taskSearch.click();
    }
}
