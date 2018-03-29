import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringedTest {
    Stringed viola;

    @Before
    public void before(){
        viola = new Stringed("Viola");
    }

    @Test
    public void canTune() {
        assertEquals("Squeak Wail", viola.tune());
    }
}
