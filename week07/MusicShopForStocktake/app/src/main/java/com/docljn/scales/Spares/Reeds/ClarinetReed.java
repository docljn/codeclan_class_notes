package com.docljn.scales.Spares.Reeds;
import com.docljn.scales.Instruments.Section;
import com.docljn.scales.StockItem;


/**
 * Created by lornanoble on 20/01/2018.
 */


public class ClarinetReed extends StockItem {
    private ClarinetReedType clarinetReedType;
    private ClarinetReedNumber clarinetReedNumber;

    public ClarinetReed(String brand, double purchasePrice, double sellingPrice, Section section, String description, ClarinetReedType clarinetReedType, ClarinetReedNumber clarinetReedNumber) {
        super(brand, purchasePrice, sellingPrice, section, description);
        this.clarinetReedType = clarinetReedType;
        this.clarinetReedNumber = clarinetReedNumber;
    }

    public ClarinetReedType getClarinetReedType() {
        return this.clarinetReedType;
    }


    public ClarinetReedNumber getClarinetReedNumber() {
        return this.clarinetReedNumber;
    }
}
