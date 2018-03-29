import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Jenners");
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

}