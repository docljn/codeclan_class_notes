import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Concertgoer concertgoer;

    @Before
    public void before(){
        concertgoer = new Concertgoer("Jim");
    }

    @Test
    public void personHasName(){
        assertEquals("Jim", concertgoer.getName());
    }

    @Test
    public void personCanChangeName(){
        concertgoer.setName("James");
        assertEquals("James", concertgoer.getName());

    }

}
