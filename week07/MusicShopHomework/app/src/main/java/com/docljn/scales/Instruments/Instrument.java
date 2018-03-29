package com.docljn.scales.Instruments;


import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 19/01/2018.
 */

public abstract class Instrument extends StockItem implements Playable {
    Enum<Section> section;
    public String description;


    public Instrument(String name, double purchasePrice, double sellingPrice, Section section, String description) {
        super(name, purchasePrice, sellingPrice);
        this.section = section;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
