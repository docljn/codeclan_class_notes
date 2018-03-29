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
        strings.add(new ViolaString(name, 0, 0, Pitch.C));
        strings.add(new ViolaString(name, 0, 0, Pitch.G));
        strings.add(new ViolaString(name, 0, 0, Pitch.D));
        strings.add(new ViolaString(name, 0, 0, Pitch.A));
    }

    @Override
    public String play() {
        return "Mellow bowed strings";
    }

    public ArrayList<ViolaString> getStrings() {
        return this.strings;
    }
}
