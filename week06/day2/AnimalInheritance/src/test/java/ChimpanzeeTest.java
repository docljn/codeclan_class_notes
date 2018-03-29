import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {
    Chimpanzee chimpanzee;

    @Before
    public void before(){
        chimpanzee = new Chimpanzee("Thing One");
    }

    @Test
    public void hasName(){
        assertEquals("Thing One", chimpanzee.getName());
    }

    @Test
    public void canEat(){
        assertEquals("Crunch Munch", chimpanzee.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("Gasp Wheeze", chimpanzee.breathe());
    }

    @Test
    public void canTalk(){
        assertEquals("Hoot Jabber", chimpanzee.talk());
    }

}

/*
    Create your own inheritance chain for modelling various types of animal.

        Create two further subclasses of Mammal: Human and Chimpanzee. They should have a talk() method.
        Make each method return a suitable string. Check that you can create a human and a chimpanzee object, and make sure that they can each eat, breathe, walk, and talk.
*/
