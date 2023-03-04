package StepDefenition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Step;
import org.junit.Assert;

public class CucumberSteps {
    private static double x;
    private static double y;

    @Step("Ввод числа {first}")
    @Когда("^Пользователь вводит x (.*)$")
        public static void readX(Double first){
        x = first;
        Assert.assertEquals("Значение Х ", x == first);
    }


    @Step(value = "Ввод числа {second}")
    @Когда("^Пользователь вводит y (.*)$")
    public static void readY(Double second){
        y = second;
    }

    @Step("Вывод результата сложения {x} и {y}")
    @Тогда("^Получить сумму$")
    public static void sum (){
        System.out.println("Сумма чисел равна : " + (x + y));
    }
}

