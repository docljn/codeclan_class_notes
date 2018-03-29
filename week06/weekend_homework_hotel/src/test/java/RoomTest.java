import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;

    @Before
    public void before(){
        room = new Room("One", true, true, 99.00);
    }

    @Test
    public void canGetName(){
        assertEquals("One", room.getName());
    }


    @Test
    public void canGetChargeableStatus(){
        assertEquals(true, room.getChargeable());
    }

    @Test
    public void canGetAccessibleStatus(){
        assertEquals(true, room.getAccessible());
    }


    @Test
    public void canSetName(){
        room.setName("Number One");
        assertEquals("Number One", room.getName());
    }


    @Test
    public void canSetChargeableStatus(){
        room.setChargeable(false);
        assertEquals(false, room.getChargeable());
    }

    @Test
    public void canSetAccessibleStatus(){
        room.setAccessible(false);
        assertEquals(false, room.getAccessible());
    }

    @Test
    public void canGetPrice(){
        assertEquals(99.00, room.getPrice(), 0.001);
    }

    @Test
    public void canSetPrice(){
        room.setPrice(89.00);
        assertEquals(89.00, room.getPrice(), 0.001);
    }

    @Test
    public void roomPriceIsZeroIfNotChargeable(){
        room.setChargeable(false);
        assertEquals(0.00, room.getPrice(), 0.001);
    }


}
