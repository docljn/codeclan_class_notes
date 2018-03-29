package com.docljn.scales.Spares;


import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class Seat extends StockItem {
    private int height;
    private boolean adjustable;

    public Seat(String name, double purchasePrice, double sellingPrice, int height, boolean adjustable) {
        super(name, purchasePrice, sellingPrice);
        this.height = height;
        this.adjustable = adjustable;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isAdjustable() {
        return this.adjustable;
    }
}
