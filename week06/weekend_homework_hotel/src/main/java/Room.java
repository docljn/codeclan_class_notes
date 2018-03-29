public class Room {

    /*
    If you are willing to have bespoke setup per hotel,
    you can use an ENUM for the rooms, with the values being e.g. capacity, name, type, etc.
    */


    private double price;
    private boolean accessible;
    private boolean chargeable;
    private String name;

    public Room(String name, boolean accessible, boolean chargeable, double price) {
        this.name = name;
        this.chargeable = chargeable;
        this.accessible = accessible;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public boolean getChargeable() {
        return this.chargeable;
    }

    public boolean getAccessible() {
        return this.accessible;
    }

    public double getPrice() {
        if (this.getChargeable()) {
            return this.price;
        } else {
            return 0.00;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

/*
I would like to make chargeable the default, and not have to set it at initialization
but how then to use new Room to make a room using information from a database?
*/
