package example.docljn.com.butterflies;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class ButterflyListTest {

    ButterflyList butterflyList;

    @Before
    public void before(){
        butterflyList = new ButterflyList();
    }

    @Test
    public void returnsArrayList(){
        assertEquals(10, butterflyList.getList().size());
    }


}
