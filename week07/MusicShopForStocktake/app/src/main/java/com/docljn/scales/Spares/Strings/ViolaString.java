package com.docljn.scales.Spares.Strings;
import com.docljn.scales.Instruments.Section;
import com.docljn.scales.Spares.Pitch;
import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ViolaString extends StockItem {

    private Pitch pitch;

    public ViolaString(String brand, double purchasePrice, double sellingPrice, Section section, String description, Pitch pitch) {
        super(brand, purchasePrice, sellingPrice, section, description);
        this.pitch = pitch;
    }

    public Pitch getPitch() {
        return this.pitch;
    }
}
