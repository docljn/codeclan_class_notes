package example.docljn.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 24/01/2018.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player();
    }

    @Test
    public void canChoose(){
        player.choose("rock");
        assertEquals("rock", player.getHand());
    }
}
