import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {

    InternetRadio radio;

    @Before
    public void before(){
        radio = new InternetRadio();
    }

    @Test
    public void canConnect(){
        assertEquals("InternetRadio connecting to network: CodeClan", radio.connect("CodeClan"));
    }

    @Test
    public void canTune(){
        assertEquals("Tuning to Radio 1", radio.tuneTo("Radio 1"));
    }


}
