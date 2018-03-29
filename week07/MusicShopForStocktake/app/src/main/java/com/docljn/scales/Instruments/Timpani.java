package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Pitch;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Timpani extends Instrument {
    private Pitch pitch;

    public Timpani(String name, double purchasePrice, double sellingPrice, Section section, String description, Pitch pitch) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.pitch = pitch;
    }

    @Override
    public String play() {
        return null;
    }

    public Pitch getPitch() {
        return this.pitch;
    }

    public void setPitch(Pitch pitch) {
        this.pitch = pitch;
    }
}
