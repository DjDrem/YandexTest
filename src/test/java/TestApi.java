import org.junit.Assert;
import org.junit.Test;

import static apiSteps.checkLocation.*;
import static apiSteps.checkSpecies.*;
import static apiSteps.findInfoCharacter.infoCharacters;
import static apiSteps.getLastCharacter.gettingLastCharacterID;
import static apiSteps.getLastCharacter.infoLastCharacters;
import static apiSteps.selectLastEpisode.selectEpisode;

public class TestApi {
    @Test
    public void  testFindCharacter(){
        infoCharacters("2");
    }
    @Test
    public void testSelectEpisode(){
        selectEpisode("2");
    }
    @Test
    public void testGetLastCharacter(){
        gettingLastCharacterID("51");
        infoLastCharacters();
    }
    @Test
    public void checkSpecies(){
        chekingSpesies("2", "825");
        Assert.assertEquals(firstSpecies, secondSpecies);
    }
    @Test
    public void checkLocation(){
        chekingLocation("2", "825");
        Assert.assertEquals("Местоположение персонажей", firstLocation, secondLocation);
    }
}