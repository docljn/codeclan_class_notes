import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
//    Once you've refactored to use a superclass and inheritance,
//    All you need is to test the constructor, and any methods unique to this class.

    Student student;

    @Before
    public void before(){
        student = new Student("Alex", "G3");
    }


    @Test
    public void hasName(){
        assertEquals("Alex", student.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G3", student.getCohort());
    }

    @Test
    public void canChangeName(){
        student.setName("Clare");
        assertEquals("Clare", student.getName());
    }
    @Test
    public void canChangeCohort(){
        student.setCohort("G4");
        assertEquals("G4", student.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love learning Java", student.talk("Java"));
    }
}
