package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Pitch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class TimpaniTest {

    Timpani timpano;

    @Before
    public void before(){
        timpano = new Timpani("Kettle Drum", 3000, 5000, Section.PERCUSSION, "Brass with calfskin drumhead", Pitch.G);
    }

    @Test
    public void canGetPitch() {
        assertEquals(Pitch.C, timpano.getPitch());
    }

    @Test
    public void canSetPitch(){
        timpano.setPitch(Pitch.G);
        assertEquals(Pitch.G, timpano.getPitch());
    }
}
