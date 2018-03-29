import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Guest guest;
    Bedroom room;


    @Before
    public void before(){
        booking = new Booking(1);
        guest = new Guest("Kat", true);
        room = new Bedroom("1", true, true, 49.50, BedroomType.SINGLE);
    }


    @Test
    public void bookingStartsWithReference(){
        assertEquals(1, booking.getReference());
        assertEquals(null, booking.getStartDate());
        assertEquals(null, booking.getEndDate());
        assertEquals(0, booking.getRequirements().size());
        assertEquals(0.00, booking.getCost(), 0.001);
        assertEquals(BookingStatus.CREATED, booking.getStatus());
    }

    @Test
    public void bookingReturnsGuestCount(){
        assertEquals(0, booking.getGuestCount());

    }

    @Test
    public void bookingAddsGuest(){
        booking.add(guest);
        assertEquals(1, booking.getGuests().size());
        assertEquals("Kat", booking.getGuests().get(0).getName());
    }

    @Test
    public void bookingRemovesGuest(){
        booking.add(guest);
        booking.removeGuest(guest);
        assertEquals(0, booking.getGuestCount());
    }

    @Test
    public void bookingAddsRoom(){
        booking.add(room);
        assertEquals(1, booking.getRooms().size());
        assertEquals(room, booking.getRooms().get(0));
    }

    @Test
    public void bookingRemovesRoom(){
        booking.add(room);
        booking.removeRoom(room);
        assertEquals(0, booking.getRoomCount());
    }


    @Test
    public void bookingAddsRequirement(){
        booking.add(Requirement.WAKE_UP_CALL);
        assertEquals(1, booking.getRequirements().size());
        assertEquals(Requirement.WAKE_UP_CALL, booking.getRequirements().get(0));
    }

    @Test
    public void bookingRemovesRequirement(){
        booking.add(Requirement.WAKE_UP_CALL);
        booking.removeRequirement(Requirement.WAKE_UP_CALL);
        assertEquals(0, booking.getRequirements().size());
    }

    @Test
    public void bookingAddsCharge(){
        booking.add(room.getPrice());
        assertEquals(49.50, booking.getCost(), 0.001);
    }

    @Test
    public void bookingCostCannotGoNegative(){
        booking.add(100.00);
        booking.add(-200.00);
        assertEquals(0.00, booking.getCost(), 0.001);
    }

    @Test
    public void bookingCanBeCompleted(){
        booking.complete();
        assertEquals(BookingStatus.COMPLETED, booking.getStatus());
    }

    @Test
    public void bookingCanBeActivated(){
        booking.activate();
        assertEquals(BookingStatus.ACTIVE, booking.getStatus());
    }

    @Test
    public void bookingCanBeCancelled(){
        booking.cancel();
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());

    }



    @Test
    public void bookingCanAddStartDate(){
        booking.add("2018-01-14");
        assertEquals("2018-01-14", booking.getStartDate().toString());

    }

    @Test
    public void bookingCanAddDuration(){
        booking.add("2018-01-14");
        booking.add(1);
         assertEquals("2018-01-15", booking.getEndDate().toString());

    }

    @Test
    public void bookingReturnsLengthOfBooking(){
        booking.add("2018-01-14");
         booking.add(2);
         assertEquals(2, booking.getDuration());
    }

    @Test
    public void bookingCanBeSearchedByGuest(){
        booking.add(guest);
        assertEquals(true, booking.includesGuest(guest));
    }



//    @Test
//    public void bookingReturnsRoomCountByType(){
//        booking.add(room);
//        assertEquals(1, booking.getRoomTypeCount(BedroomType.SINGLE));
//    }





}
