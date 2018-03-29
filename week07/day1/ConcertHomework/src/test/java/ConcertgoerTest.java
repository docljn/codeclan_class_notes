import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcertgoerTest {

        Concertgoer concertgoer;

        @Before
        public void before(){
            concertgoer = new Concertgoer("Jim");
        }

        @Test
        public void canCough(){
            assertEquals("Hrrrmph, Bark", concertgoer.cough());
        }

}
