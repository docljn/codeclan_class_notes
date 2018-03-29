package com.docljn.scales.Spares.Reeds;

import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ClarinetReed extends StockItem {
    private ClarinetReedType clarinetReedType;
    private ClarinetReedNumber clarinetReedNumber;

    public ClarinetReed(String name, double purchasePrice, double sellingPrice, ClarinetReedType clarinetReedType, ClarinetReedNumber clarinetReedNumber) {
        super(name, purchasePrice, sellingPrice);
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
