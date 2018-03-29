package example.docljn.com.butterflies;

import java.io.Serializable;

/**
 * Created by lornanoble on 23/01/2018.
 */

// If you want the object to be passable as a tag, you need to implement Serializable interface
//    this would be only if you needed all the attributes passed through to a second activity
//    you need to then add a method in the source activity to make the intent which you will pass through

public class Butterfly implements Serializable {
    private String commonName;
    private String latinName;
    private int imageID;

    public Butterfly(String commonName, String latinName, int imageID){

        this.commonName = commonName;
        this.latinName = latinName;
        this.imageID = imageID;
    }

    public String getCommonName() {
        return this.commonName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getImageID() {
        return this.imageID;
    }
}
