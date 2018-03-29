import java.math.BigDecimal;

public enum BedroomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    SUITE (4);


    private final int capacity;

    BedroomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
