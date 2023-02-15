package pageSteps;

import io.qameta.allure.Step;
import static pageElements.BagElements.*;
import static pageElements.DashboardElements.createButton;

public class BagSteps {
    @Step
    public static void createBag (String theme, String description, String environment){
        createButton.click();
        bugTheme.sendKeys(theme);
        descriptionBug.click();
        descriptionBug.sendKeys(description);
        environmentBug.click();
        environmentBug.sendKeys(environment);
        buttonAppointMe.click();
        createButon.click();
    }

    @Step
    public static void changestatusBag (){

    }

//    @Step
//    public static void closeBag (){
//
//    }
}
