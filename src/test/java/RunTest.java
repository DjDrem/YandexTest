import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {
    @Before
    public void Greetings() {
        System.out.println("Запуск Тестов");
    }

    @Test
    public void SumTest(){
        int first_number = 7;
        int second_number = 13;
        int sum = first_number + second_number;
        System.out.println(sum);
        Assert.assertEquals("Ошибка сложения", 20, sum);
    }
    @Test
    public void ArrayTest(){
        String[] first_array = {"one", "two","three"};
        String[] second_array = {"one", "two", "three"};
        System.out.println("Первый " + first_array[1]);
        System.out.println("Второй " + second_array[1]);
        Assert.assertArrayEquals(first_array, second_array);
    }
    @Test
    public void ErrorArrayTest(){
        String[] first_array = {"one", "two","three"};
        String[] second_array = {"one", "five", "three"};
        System.out.println("Первый " + first_array[0]);
        System.out.println("Второй " + second_array[0]);
        Assert.assertArrayEquals(first_array, second_array);
    }
    @Test
    public void ErrorSumTest(){
        int first_number = 5;
        int second_number = 3;
        int sum = first_number + second_number;
        System.out.println(sum);
        Assert.assertEquals("Ошибка сложения", 9, sum);
    }
    @After
    public void Completion(){
        System.out.println("Проведение тестирования окончено!");
    }
}
