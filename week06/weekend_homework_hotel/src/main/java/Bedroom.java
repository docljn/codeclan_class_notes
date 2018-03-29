import java.math.BigDecimal;

public class Bedroom extends Room {
    private final int capacity;
    private final BedroomType type;
    private double price;

    public Bedroom(String name, boolean accessible, boolean chargeable, double price, BedroomType type) {
        super(name, accessible, chargeable, price);
        this.type = type;
        this.capacity = getCapacity();
    }

    public BedroomType getBedroomType() {
        return this.type;
    }

    public int getCapacity() {
        return this.getBedroomType().getCapacity();
    }




//    I don't want to be able to change the type of the bedroom



}
