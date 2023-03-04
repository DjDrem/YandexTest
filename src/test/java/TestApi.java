import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;
import static apiSteps.createUsers.userCreate;
import static apiSteps.loginJira.jiraLogin;
import static apiSteps.rickAndMorty.*;

@DisplayName("Тестирование Api")
@Feature("Api")
public class TestApi {
    @Test
    @DisplayName("Проверка информации о персонажах")
    @Story("info character")
    @Description("Поиск персонажа по id, выбор крайнего эпизода, поиск последнего персонажа в этом эпизоде, " +
            "вывод информации и сравнение локации и рассы персрнажей")
    public void testRickAndMorty(){
        findInformationCharacter("2");
        selectEpisode();
        gettingLastCharacterID();
        infoLastCharacters();
        Assert.assertEquals("Расса персонажей",charSpecies, charLastSpecies);
        Assert.assertEquals("Местоположение персонажей", charLocation, charLastLocation);
    }
    @Test
    public void testUserCreate() throws IOException {
        userCreate();
    }
    @Test
    public void testLoginJira(){
        jiraLogin();
    }
}
