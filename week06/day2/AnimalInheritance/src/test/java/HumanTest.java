import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {
    Human human;

    @Before
    public void before(){
        human = new Human("Thing One");
    }

    @Test
    public void hasName(){
        assertEquals("Thing One", human.getName());
    }

    @Test
    public void canEat(){
        assertEquals("Crunch Munch", human.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("Gasp Wheeze", human.breathe());
    }

    @Test
    public void canTalk(){
        assertEquals("A pint of Guinness, please.", human.talk());
    }

}

/*
    Create your own inheritance chain for modelling various types of animal.

        Create two further subclasses of Mammal: Human and Chimpanzee. They should have a talk() method.
        Make each method return a suitable string. Check that you can create a human and a chimpanzee object, and make sure that they can each eat, breathe, walk, and talk.
*/