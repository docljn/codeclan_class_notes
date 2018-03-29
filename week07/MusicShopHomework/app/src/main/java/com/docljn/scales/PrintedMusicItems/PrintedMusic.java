package com.docljn.scales.PrintedMusicItems;

import com.docljn.scales.Instruments.Section;
import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 19/01/2018.
 */

public class PrintedMusic extends StockItem {

    public  Section section;

    public PrintedMusic(String name, double purchasePrice, double sellingPrice, Section section) {
        super(name, purchasePrice, sellingPrice);
        this.section = section;
    }


    public Section getSection() {
        return this.section;
    }
}
