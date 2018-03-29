import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightBall;

    @Before
    public void before(){
        eightBall = new EightBall();
    }

    @Test
    public void testDummyMethod(){
        assertEquals(0, 0);
    }

    @Test
    public void canAddAnswer(){
        eightBall.addAnswer("Signs tend towards the negative.");
        assertEquals(4, eightBall.getNumberOfAnswers());
    }

    @Test
    public void canDeleteAnswer(){
        eightBall.deleteAnswer("Perhaps...");
        assertEquals(2, eightBall.getNumberOfAnswers());
    }



}
