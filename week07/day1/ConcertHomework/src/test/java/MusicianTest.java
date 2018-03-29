import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicianTest {

    Conductor conductor;


    @Before
    public void before(){
        conductor = new Conductor("Osmo", Skill.EXPERT, true);
    }

    @Test
    public void canGetSkillLevel(){
        assertEquals(Skill.EXPERT, conductor.getSkillLevel());
    }

    @Test
    public void canSetSkillLevel(){
        conductor.setSkillLevel(Skill.COMPETENT);
        assertEquals(Skill.COMPETENT, conductor.getSkillLevel());
    }






}
