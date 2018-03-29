package com.docljn.scales.Spares.Reeds;

/**
 * Created by lornanoble on 20/01/2018.
 */

public enum ClarinetReedNumber {
    ONE(1),
    ONE_POINT_FIVE(1.5),
    TWO(2),
    TWO_POINT_FIVE(2.5),
    THREE(3),
    THREE_POINT_FIVE(3.5),
    FOUR(4),
    FOUR_POINT_FIVE(4.5),
    FIVE(5);

    private double strength;

    ClarinetReedNumber(double strength) {
        this.strength = strength;
    }

    public double getStrength(){
        return this.strength;
    }

    //    TODO: refactor to have classes of instrument reeds, with type and number

}
