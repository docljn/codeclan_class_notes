import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom("Two", true, true, 99.00, BedroomType.DOUBLE);
    }

    @Test
    public void canGetType(){
        assertEquals(BedroomType.DOUBLE ,bedroom.getBedroomType());
    }

    @Test
    public void canGetCapacity(){
        bedroom.getCapacity();
        assertEquals(2, bedroom.getCapacity());
    }




}
