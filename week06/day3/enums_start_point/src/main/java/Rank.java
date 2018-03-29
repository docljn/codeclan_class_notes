public enum Rank {

    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

//    semicolon is needed at end of list if you are adding properties

    private final int value;
//    final means it cannot be modified

//    constructor:
    Rank(int value) {
        this.value = value;
    }

    /*
when java creates an enum, a value will be passed in and stored in the field value
we are not going to use the constructor, hence we cannot set it to public etc
you pass the value in just like any other parameter when the rank is created
you can have many fields in the () - use the same constructor, but need separate getters for each one
*/

    public int getValue() {
        return this.value;
    }

}
