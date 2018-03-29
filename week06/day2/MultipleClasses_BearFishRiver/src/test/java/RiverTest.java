import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    River river;
    Salmon salmon;
//    sets a salmon-shaped hole which is equal to null

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void canAddSalmon(){
        river.addSalmon(salmon);
        assertEquals(1, river.getSalmonCount());
    }

    @Test
    public void canRemoveSalmon(){
        river.addSalmon(salmon);
        Salmon removedSalmon = river.removeSalmon();
//        the method needs to return a salmon
        assertEquals(0, river.getSalmonCount());
    }
}
