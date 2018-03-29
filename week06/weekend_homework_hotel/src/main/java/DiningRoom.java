public class DiningRoom extends Room {
    private final int maxCapacity;
    private final int tableCount;


    public DiningRoom(String name, boolean accessible, boolean chargeable, int price, int maxCapacity, int tableCount) {
        super(name, accessible, chargeable, price);
        this.maxCapacity = maxCapacity;
        this.tableCount = tableCount;
    }

    public int getTableCount() {
        return this.tableCount;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
