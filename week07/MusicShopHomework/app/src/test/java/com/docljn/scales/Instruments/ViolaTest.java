package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Pitch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ViolaTest {

    private Viola viola;

    @Before
    public void before(){
        viola = new Viola("Yamaha", 200, 450, Section.STRINGS, "Rosewood");
    }


    @Test
    public void canPlay(){
        assertEquals("Mellow bowed strings", viola.play());
    }

    @Test
    public void hasStringTuning(){
        assertEquals(Pitch.C, viola.getStrings().get(0).getPitch());
    }

}
