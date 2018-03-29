import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeniorInstructorTest {
//    Once you've refactored to use a superclass and inheritance,
//    All you need is to test the constructor, and any methods unique to this class.

    SeniorInstructor instructor;

    @Before
    public void before(){
        instructor = new SeniorInstructor("Ally", "G3", "JavaScript", "Purple");
    }


    @Test
    public void hasName(){
        assertEquals("Ally", instructor.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G3", instructor.getCohort());
    }

    @Test
    public void hasModuleTeam(){
        assertEquals("JavaScript", instructor.getModuleTeam());
    }

    @Test
    public void hasFavouriteHat(){
        assertEquals("Purple", instructor.getFavouriteHat());
    }

    @Test
    public void canChangeName(){
        instructor.setName("Sandy");
        assertEquals("Sandy", instructor.getName());
    }
    @Test
    public void canChangeCohort(){
        instructor.setCohort("G4");
        assertEquals("G4", instructor.getCohort());
    }

    @Test
    public void canChangeModuleTeam(){
        instructor.setModuleTeam("Java");
        assertEquals("Java", instructor.getModuleTeam());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", instructor.talk("Java"));
    }


}

