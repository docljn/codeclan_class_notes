import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Brass trumpet;

    @Before
    public void before(){
        trumpet = new Brass("Trumpet");
    }

    @Test
    public void hasName(){
        assertEquals("Trumpet", trumpet.getName());
    }
}
