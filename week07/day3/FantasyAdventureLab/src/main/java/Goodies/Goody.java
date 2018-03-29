package Goodies;

import java.util.ArrayList;

public class Goody extends CastMember {

    ArrayList<TreasureType> lootBag;

    public Goody(String name, int healthPoints) {
        super(name, healthPoints);
        this.lootBag = new ArrayList<>();
    }

    public ArrayList<TreasureType> getLootBag() {
        return this.lootBag;
    }

    public void acceptTreasure(TreasureType treasureType) {
        this.lootBag.add(treasureType);
    }
}
