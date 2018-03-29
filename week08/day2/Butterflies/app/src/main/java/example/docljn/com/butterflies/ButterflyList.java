package example.docljn.com.butterflies;

import java.util.ArrayList;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class ButterflyList {

    public ArrayList<Butterfly> list;

    public ButterflyList(){
        list = new ArrayList<>();
        list.add(new Butterfly("Duke of Burgundy", "Hamearis lucina", R.drawable.duke_of_burgundy));
        list.add(new Butterfly("Pearl-bordered Fritillary", "Boloria euphrosyne", R.drawable.pearl_bordered_fritillary));
        list.add(new Butterfly("Large Blue", "Phengaris arion", R.drawable.large_blue));
        list.add(new Butterfly("Swallowtail", "Papilio machaon", R.drawable.swallowtail));
        list.add(new Butterfly("White Admiral", "Limenitis camilla", R.drawable.white_admiral));
        list.add(new Butterfly("High Brown Fritillary", "Argynnis adippe", R.drawable.high_brown_fritillary));
        list.add(new Butterfly("Purple Emperor", "Apatura iris", R.drawable.purple_emperor));
        list.add(new Butterfly("Mountain Ringlet", "Erebia epiphron", R.drawable.small_mountain_ringlet));
        list.add(new Butterfly("Adonis Blue", "Polyommatus bellargus", R.drawable.adonis_blue));
        list.add(new Butterfly("Brown Hairstreak", "Thecla betulae", R.drawable.brown_hairstreak));
    }


    public ArrayList<Butterfly> getList() {
        return this.list;
    }
}
