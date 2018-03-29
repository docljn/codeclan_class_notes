import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion timpani;

    @Before
    public void before(){
        timpani = new Percussion("Timpani");
    }

    @Test
    public void canTune(){
        assertEquals("TapTap Bloink", timpani.tune());
    }
}
