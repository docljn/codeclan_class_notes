package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Pitch;
import com.docljn.scales.Spares.Strings.ViolaString;

import java.util.ArrayList;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Viola extends Instrument {

    private final ArrayList<ViolaString> strings;

    public Viola(String name, double purchasePrice, double sellingPrice, Section section, String description) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.strings = new ArrayList<ViolaString>();
        strings.add(new ViolaString("FancyStringMaker", 0, 0, Section.STRINGS, "Real gut string", Pitch.C));
        strings.add(new ViolaString("FancyStringMaker", 0, 0, Section.STRINGS, "Real gut string", Pitch.G));
        strings.add(new ViolaString("FancyStringMaker", 0, 0, Section.STRINGS, "Real gut string", Pitch.D));
        strings.add(new ViolaString("FancyStringMaker", 0, 0, Section.STRINGS, "Real gut string", Pitch.A));
    }

    @Override
    public String play() {
        return "Mellow bowed strings";
    }

    public ArrayList<ViolaString> getStrings() {
        return this.strings;
    }
}
