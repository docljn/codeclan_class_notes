import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Thing One");
    }

    @Test
    public void hasName(){
        assertEquals("Thing One", animal.getName());
    }

    @Test
    public void canEat(){
        assertEquals("Crunch Munch", animal.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("Gasp Wheeze", animal.breathe());
    }


}

/*
    Create your own inheritance chain for modelling various types of animal.

        Your base class should be Animal, and should have methods for eat() and breathe().
        Create a subclass of Animal called Mammal. Mammals should have a walk() method.
        Create two further subclasses of Mammal: Human and Chimpanzee. They should have a talk() method.
        Make each method return a suitable string. Check that you can create a human and a chimpanzee object, and make sure that they can each eat, breathe, walk, and talk.
*/
