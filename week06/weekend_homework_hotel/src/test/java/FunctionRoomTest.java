import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionRoomTest {

    FunctionRoom functionRoom;

    @Before
    public void before(){
        functionRoom = new FunctionRoom("Large",  true, true, 400.00, 100);
    }

    @Test
    public void hasType(){
        assertEquals(FunctionRoomSetup.THEATER, functionRoom.getSetup());
    }

    @Test
    public void hasMaxCapacity(){
        assertEquals(100, functionRoom.getMaxCapacity());
    }

    @Test
    public void canSetSetup(){
        functionRoom.setSetup(FunctionRoomSetup.BOARDROOM);
        assertEquals(FunctionRoomSetup.BOARDROOM, functionRoom.getSetup());
    }

    @Test
    public void capacityChangedByType(){
        functionRoom.setSetup(FunctionRoomSetup.BOARDROOM);
        assertEquals(30, functionRoom.getCapacity());
    }

    @Test
    public void canGetPrice(){
        assertEquals(400.00, functionRoom.getPrice(), 0.001);
    }

    @Test
    public void roomPriceIsZeroIfNotChargeable(){
        functionRoom.setChargeable(false);
        assertEquals(0.00, functionRoom.getPrice(), 0.001);
    }

    @Test
    public void canSetPrice(){
        functionRoom.setPrice(89.00);
        assertEquals(89.00, functionRoom.getPrice(), 0.001);
    }

}
