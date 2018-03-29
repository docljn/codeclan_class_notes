import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal("Monkey");
    }

    @Test
    public void canWalk(){
        assertEquals("Stepping out", mammal.walk());
    }
}


/*
    Create your own inheritance chain for modelling various types of animal.

        Create a subclass of Animal called Mammal. Mammals should have a walk() method.
        Create two further subclasses of Mammal: Human and Chimpanzee. They should have a talk() method.
        Make each method return a suitable string. Check that you can create a human and a chimpanzee object, and make sure that they can each eat, breathe, walk, and talk.
*/