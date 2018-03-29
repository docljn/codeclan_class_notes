import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom room;

    @Before
    public void before(){
        room = new DiningRoom("Dining Room", true, false, 200, 50, 10);
    }

    @Test
    public void hasTables(){
        assertEquals(10, room.getTableCount());
    }

    @Test
    public void hasMaxCapacity(){
        assertEquals(50, room.getMaxCapacity());
    }

}
