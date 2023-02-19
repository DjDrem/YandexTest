package StepDefenition;

import io.cucumber.java.eo.Do;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class CucumberSteps {
    private static double x;
    private static double y;

    @Когда("^Пользователь вводит x (.*)$")
        public static void readX(Double first){
        x = first;
    }

    @Когда("^Пользователь вводит y (.*)$")
    public static void readY(Double second){
        y = second;
    }

    @Тогда("^Получить сумму$")
    public static void sum (){
        System.out.println("Сумма чисел равна : " + (x + y));
    }
}

