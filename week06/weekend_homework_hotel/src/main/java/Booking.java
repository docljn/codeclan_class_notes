
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Booking {

    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Requirement> requirements;
    private double cost;
    private Enum<BookingStatus> status;
    private final int reference;


    public Booking(int reference){
        this.reference = reference;
        this.guests = new ArrayList<>();
        this.rooms = new ArrayList<>();
        /*
        consider
        this.room_allocation = new HashMap<Room, ArrayList<Guest>>();
        would give a way to show which guests were in which rooms
        */
        this.startDate = null;    //consider setting the default to 'today'
        this.endDate = null;  //consider setting the default to 'tomorrow'
        this.requirements = new ArrayList<>();
        this.cost = 0.00;
        this.status = BookingStatus.CREATED;
    }

    public int getReference() {
        return this.reference;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public double getCost() {
        return this.cost;
    }

    public ArrayList<Requirement> getRequirements() {
        return this.requirements;
    }

    public Enum<BookingStatus> getStatus() {
        return this.status;
    }


    public void add(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }


    public void add(Room room) {
        this.rooms.add(room);
    }

    public void removeRoom(Bedroom room) {
        this.rooms.remove(room);
    }


    public void add(Requirement requirement) {
        this.requirements.add(requirement);
    }

    public void removeRequirement(Requirement requirement) {
        this.requirements.remove(requirement);
    }

    public void add(double amount) {
        this.cost = this.cost + amount;
        if(this.cost < 0) {
            this.cost = 0.00;
        }
    }

    public void activate() {
        this.status = BookingStatus.ACTIVE;
    }

    public void complete() {
//        if (this.status == BookingStatus.ACTIVE){
            this.status = BookingStatus.COMPLETED;
//        }
        /*
        add logic to check that:
            the booking was checked in
            everything has been paid
            all rooms/guests have been checked out
            departure date is today or past (or allow departure date to be changed?)
        */
    }

    public void cancel() {
        this.status = BookingStatus.CANCELLED;
    }

    public int getRoomCount() {
        return this.rooms.size();
    }


    public void add(String startDate) {
        this.startDate = LocalDate.parse(startDate, Formatting.dateFormatter());
    }

    public int getDuration() {
//          need to add logic somewhere to make sure that number of nights cannot be negative,
//          could be zero if booking cancelled
        return Period.between(startDate, endDate).getDays();
    }

    public void add(int numberOfNights) {
        this.endDate = this.startDate.plusDays(numberOfNights);
    }

    public boolean includesGuest(Guest guest) {
        return this.guests.contains(guest);
    }



}
