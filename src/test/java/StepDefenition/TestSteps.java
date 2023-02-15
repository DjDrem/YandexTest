package StepDefenition;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.Scanner;

public class TestSteps {
    @Когда("^Пользователь вводит x$")
        public static int getX(){
        Scanner x = new Scanner(System.in);
        return 0;
    }

    @Когда("^Пользователь вводит y$")
    public static int getY(){
        Scanner y = new Scanner(System.in);
        return 0;
    }

    @Тогда("^Получить сумму$")
    public static int getSum(){
        int x = getX();
        int y = getY();
        int sum = (x + y);
        return sum;
    }

    @Тогда("^Вывести результат$")
    public static void getResult() {
        int sum = getSum();
        System.out.println(sum);
    }
}
