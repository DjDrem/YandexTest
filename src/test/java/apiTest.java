import hooks.ApiHooks;
import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static apiSteps.createUsers.userCreate;
import static apiSteps.loginJira.jiraLogin;
import static apiSteps.rickAndMorty.*;


@Feature("Api")
public class apiTest extends ApiHooks {
    @Test
    @DisplayName("Тест Рик и Морти")
    @Epic("Рик и Морти")
    @Story("info character")
    @Description("Поиск персонажа по id, выбор крайнего эпизода, поиск последнего персонажа в этом эпизоде, " +
            "вывод информации и сравнение локации и рассы персрнажей")
    public void testRickAndMorty(){
        findInformationCharacter("2");
        selectEpisode(charId);
        gettingLastCharacterID(lastEpisode);
        infoLastCharacters(idCharacter);
        Assert.assertEquals("Расса персонажей",charSpecies, charLastSpecies);
        Assert.assertEquals("Местоположение персонажей", charLocation, charLastLocation);
    }
    @Test
    @DisplayName("Тест Создание персонажа")
    @Epic("Создание персонажа")
    @Story("create character")
    @Description("Внесение изменения в Json файл и создание персонажа")
    public void testUserCreate() throws IOException {
        userCreate();
    }
    @Test
    @DisplayName("Тест Авторизация Jira")
    @Epic("Авторизация jira")
    @Story("authorization Jira")
    @Description("Авторизация пользователя Jira")
    public void testLoginJira(){
        jiraLogin();
    }
}
