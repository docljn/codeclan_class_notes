import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DocumentTest {

    Score carmen;

    @Before
    public void before(){
        carmen = new Score("Carmen", 12.89, "Opera");
    }

    @Test
    public void canGetName(){
        assertEquals("Carmen", carmen.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(12.89, carmen.getPrice(), 0.001);
    }

}