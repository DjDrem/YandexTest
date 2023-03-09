package StepDefenition;


import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;

public class CucumberSteps {
    private static double x;
    private static double y;

    @Когда("^Пользователь вводит x = (.*)$")
    public static void readX(Double first){
        x = first;
        Assert.assertEquals("Значение Х ", x == first);
    }

    @Когда("^Пользователь вводит y = (.*)$")
    public static void readY(Double second){
        y = second;
        Assert.assertEquals("Значение Y", y == second);
    }

    @Тогда("^Получить сумму (.*)$")
    public static void sum (){
        int result = (int)(x + y);
        System.out.println("Сумма чисел равна : " + result);
        Assert.assertEquals((x + y), result);
    }
}

