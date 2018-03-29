import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestIntegerTest {

    @Before
    public void before(){

    }

    @Test
    public void emptyArrayReturnsOne(){
        int[] empty = {};
        assertEquals(1, MyClass.getSmallestInteger(empty));
    }

    @Test
    public void nullReturnsOne(){
        assertEquals(1, MyClass.getSmallestInteger(null));
    }

    @Test
    public void missingFourArrayReturnsFour(){
        int[] noFour = {1,2,3,5,2,1};
        assertEquals(4, MyClass.getSmallestInteger(noFour));
    }

    @Test
    public void negativesArrayReturnsOne(){
        int[] negative = {-1,-3};
        assertEquals(1, MyClass.getSmallestInteger(negative));
    }

    @Test
    public void negativeAndPositiveReturnsNext(){
        int[] both = {-1, -3, 0, 1, 2};
        assertEquals(3, MyClass.getSmallestInteger(both));
    }
}
