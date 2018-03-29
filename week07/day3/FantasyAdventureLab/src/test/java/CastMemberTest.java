import Goodies.SpellCasters.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CastMemberTest {

    Creature creature;

    @Before
    public void before(){
        creature = new Creature("Joe", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Joe", creature.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, creature.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        creature.setHealthPoints(10);
        assertEquals(10, creature.getHealthPoints());
    }

    @Test
    public void canSpeakName(){
        assertEquals("I am Joe", creature.speakName());
    }

    @Test
    public void canTakeDamage(){
        creature.adjustHealthPoints(10);
        assertEquals(10, creature.getHealthPoints());

    }

    @Test
    public void healthPointsWontGoBelowZero(){
        creature.adjustHealthPoints(30);
        assertEquals(0, creature.getHealthPoints());
    }


}
