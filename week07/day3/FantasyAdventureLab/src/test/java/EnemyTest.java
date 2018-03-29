import Goodies.SpellCasters.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Creature creature;

    @Before
    public void before (){
        enemy = new Enemy("Zog", 20, 10);
        creature = new Creature("Thing1", 20);
    }

    @Test
    public void hasAttackPoints(){
        assertEquals(10, enemy.getAttackPoints());
    }

    @Test
    public void canAttackVictim(){
        enemy.attack(creature);
        assertEquals(10, creature.getHealthPoints());
    }
}
