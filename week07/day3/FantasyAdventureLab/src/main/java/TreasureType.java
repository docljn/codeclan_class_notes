public enum TreasureType {

    GOLD(200),
    SILVER(150),
    BRONZE(100),
    DIAMOND(2000);

    private final int value;

    TreasureType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


