import Goodies.Goody;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodyTest {

    Goody goody;


    @Before
    public void before(){
        goody = new Goody("Bob", 50);
    }

    @Test
    public void canAcceptTreasure(){
        goody.acceptTreasure(treasureType);
        assertEquals(100, goody.getLootBag().get(0).getValue());
    }

}
