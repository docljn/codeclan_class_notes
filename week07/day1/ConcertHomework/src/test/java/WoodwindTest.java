import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Woodwind clarinet;

    @Before
    public void before(){
        clarinet = new Woodwind("Clarinet");
    }

    @Test
    public void canTune(){
        assertEquals("Quack Squeak", clarinet.tune());
    }

}
