import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;


    @Before
    public void before(){
        bus = new Bus("Leith", 1);
    }


    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void takeOnPassenger(){
        bus.board(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void getBusCapacity(){
        assertEquals(1, bus.getCapacity());
    }

    @Test
    public void cantTakePassengerIfBusFull(){
        bus.board(person);
        bus.board(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void numberOfEmptySeats(){
        bus.board(person);
        assertEquals(0, bus.emptySeatCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.board(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }
}
