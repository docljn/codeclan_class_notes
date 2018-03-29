import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreTest {

    Score carmen;

    @Before
    public void before(){
        carmen = new Score("Carmen", 12.89, "Opera");
    }

    @Test
    public void canGetGenre(){
        assertEquals("Opera", carmen.getGenre());
    }

    @Test
    public void canSetGenre(){
        carmen.setGenre("Opera comique");
        assertEquals("Opera comique", carmen.getGenre());
    }

}