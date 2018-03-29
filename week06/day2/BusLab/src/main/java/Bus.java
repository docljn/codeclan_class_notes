import java.util.ArrayList;

public class Bus {


    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public int passengerCount() {
        return this.passengers.size();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int emptySeatCount() {
        return this.capacity - this.passengers.size();

    }

    public void board(Person person) {
        if (this.emptySeatCount() > 0) {
            this.passengers.add(person);
        }

    }

    public Person removePassenger(Person person) {

        this.passengers.remove(person);
        return person;
    }
}
