package com.docljn.scales.Instruments;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Piano extends Instrument {
    private final PianoType pianoType;

    public Piano(String name, double purchasePrice, double sellingPrice, Section section, String description, PianoType pianoType) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.pianoType = pianoType;
    }

    @Override
    public String play() {

        if (getPianoType() == PianoType.PIANOLA){
            return "Inserts piano roll, pedals bellows, adjusts play speed, flicks switch";
        } else {
            return "Tinkles ivories";
        }
    }

    public PianoType getPianoType() {
        return this.pianoType;
    }
}
