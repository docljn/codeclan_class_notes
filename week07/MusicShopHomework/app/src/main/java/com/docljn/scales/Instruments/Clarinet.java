package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Reeds.ClarinetReed;
import com.docljn.scales.Spares.Reeds.ClarinetReedNumber;
import com.docljn.scales.Spares.Reeds.ClarinetReedType;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Clarinet extends Instrument{
    private ClarinetReed reed;

    public Clarinet(String name, double purchasePrice, double sellingPrice, Section section, String description) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.reed = new ClarinetReed("Yamaha", 0, 0, ClarinetReedType.E_FLAT, ClarinetReedNumber.TWO);

    }

    @Override
    public String play() {
        return "Duck-like quacking at " + getPlayingVolume()  +"dB";
    }

    public ClarinetReedType getReedType() {
        return this.reed.getClarinetReedType();
    }

    public ClarinetReedNumber getReedNumber() {
        return this.reed.getClarinetReedNumber();
    }

    public double getPlayingVolume(){
        return 80 + 5*getReedNumber().getStrength();
    }


    public void setReed(ClarinetReed reed) {
        this.reed = reed;
    }
}
