import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConductorTest {

    Conductor conductor;
    Score carmen;


    @Before
    public void before(){
        conductor = new Conductor("Osmo", Skill.EXPERT, true);
        carmen = new Score("Carmen", 12.89, "Opera");
    }

    @Test
    public void canConduct(){
        assertEquals("Waves Baton", conductor.conducts());
    }

    @Test
    public void applaud() {
        assertEquals("Tap Tap", conductor.applaud());
    }


    @Test
    public void canSpeak() {
        assertEquals("Tutti", conductor.speak());
    }

    @Test
    public void canRehearseScore(){
        assertEquals("Conducts Carmen in broken stages.", conductor.rehearse(carmen));
    }

}
