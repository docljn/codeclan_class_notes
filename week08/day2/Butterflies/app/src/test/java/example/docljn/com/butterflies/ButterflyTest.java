package example.docljn.com.butterflies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class ButterflyTest {

    Butterfly butterfly;

    @Before
    public void before() {
        butterfly = new Butterfly("Common Name", "Latin Name", 1);
    }

    @Test
    public void getsCommonName(){
        assertEquals("Common Name", butterfly.getCommonName());
    }

    @Test
    public void getsLatinName(){
        assertEquals("Latin Name", butterfly.getLatinName());
    }

    @Test
    public void getsImageLocation(){
        assertEquals(1, butterfly.getImageID());
    }
}
