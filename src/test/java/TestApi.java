import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static apiSteps.createUsers.userCreate;
import static apiSteps.loginJira.jiraLogin;
import static apiSteps.rickAndMorty.*;

public class TestApi {
    @Test
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
    public void testLoginJira() throws IOException {
        jiraLogin();
    }
}
