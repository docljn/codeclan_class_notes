package com.docljn.scales.Instruments;


/**
 * Created by lornanoble on 20/01/2018.
 */

public class Horn extends Instrument {

    private final int valveNumber;

    public Horn(String name, double purchasePrice, double sellingPrice, Section section, String description, int valveNumber) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.valveNumber = valveNumber;
    }




    @Override
    public String play() {
        return "Hoot hoot";
    }

    public int getValveNumber() {
        return this.valveNumber;
    }
}
