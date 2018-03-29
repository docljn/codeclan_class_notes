import java.util.ArrayList;

public class Hotel {
    private final ArrayList<Booking> bookings;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<FunctionRoom> functionRooms;
    private String name;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<FunctionRoom> functionRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.functionRooms = functionRooms;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }


    public ArrayList<DiningRoom> getDiningRooms() {
        return this.diningRooms;
    }

    public ArrayList<FunctionRoom> getFunctionRooms() {
        return this.functionRooms;
    }

    public ArrayList<Booking> getBookings() {
        return this.bookings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public void addFunctionRoom(FunctionRoom functionRoom) {
        this.functionRooms.add(functionRoom);
    }

    public int getBedCount() {
        int count = 0;
        for (Bedroom bedroom: bedrooms) {
            count = count + bedroom.getCapacity();
        }
        return count;
    }


    public int getBedroomCount() {
        return getBedrooms().size();
    }

    public int getDiningRoomCount() {
        return getDiningRooms().size();
    }

    public int getFunctionRoomCount() {
        return getFunctionRooms().size();
    }

    public Booking newBooking(int reference) {
        Booking booking = new Booking(reference);
        this.bookings.add(booking);
        return booking;
    }

    public Booking selectBooking(int reference) {
        for (Booking booking: getBookings()){
            if (booking.getReference() == reference){
                return booking;
            }
        } return null;
    }

    public void deleteBooking(int reference) {
        // you would only use this if a booking had not been fully added to the db or other storage system
        this.bookings.remove(selectBooking(reference));
    }

    public ArrayList<Room> getAllRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.addAll(bedrooms);
        rooms.addAll(diningRooms);
        rooms.addAll(functionRooms);
        return rooms;
    }

    public ArrayList<Room> getOccupiedRooms() {
    //     maybe add logic to ignore any bookings which have been marked as cancelled
    //     also need to think about taking in a date field when searching, if this was actually going to work!
        ArrayList<Room> occupiedRooms = new ArrayList<>();
        for (Booking booking: getBookings()){
                occupiedRooms.addAll(booking.getRooms());
            }
        return occupiedRooms;
    }

    public ArrayList<Room> getVacantRooms() {
        ArrayList<Room> vacantRooms = new ArrayList<>();
        vacantRooms.addAll(getAllRooms());
        for (Room room: getOccupiedRooms()) {
                vacantRooms.remove(room);
            }
        return vacantRooms;
    }

    public ArrayList<Room> getVacantBedrooms() {
        ArrayList<Room> vacantBedrooms = new ArrayList<>(this.bedrooms);
        for (Room room: getOccupiedRooms()) {
            vacantBedrooms.remove(room);
        }
        return vacantBedrooms;
    }

    public void checkIn(Guest guest) {
        for (Booking booking: bookings) {
            if (booking.includesGuest(guest)){
                booking.activate();
//                add something here to allocate guests to particular rooms?
            }
        }
    }

    public void checkOut(Guest guest) {
//        assuming that a guest is only associated with one booking at this stage!
        for (Booking booking: bookings) {
            if (booking.includesGuest(guest)){  // need to add logic to check that everything has been paid etc.
                booking.complete();
                // also need to add guest data to archive or purge list depending on data protection permissions
            }
        }
    }

}
