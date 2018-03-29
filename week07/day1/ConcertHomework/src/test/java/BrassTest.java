import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrassTest {

    Brass trumpet;

    @Before
    public void before(){
        trumpet = new Brass("Trumpet");
    }


    @Test
    public void canTune() {
        assertEquals("Hoot parp", trumpet.tune());
    }
}