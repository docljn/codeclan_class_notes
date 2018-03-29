public class FunctionRoom extends Room {
    private final int maxCapacity;
    private double price;
    private FunctionRoomSetup setup;

    public FunctionRoom(String name, boolean accessible, boolean chargeable, double price, int maxCapacity) {
        super(name, accessible, chargeable, price);
        this.maxCapacity = maxCapacity;
        this.setup = FunctionRoomSetup.THEATER;
    }

    public FunctionRoomSetup getSetup() {
        return this.setup;
    }


    public void setSetup(FunctionRoomSetup setup) {
        this.setup = setup;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCapacity() {
        int modifier = getSetup().getCapacityModifier();
        return this.maxCapacity * modifier / 10;
    }



}
