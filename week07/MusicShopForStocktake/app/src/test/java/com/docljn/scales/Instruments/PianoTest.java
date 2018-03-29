package com.docljn.scales.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class PianoTest {

    private Piano pianola;

    @Before
    public void before(){
        pianola = new Piano("Pianola", 3000, 4500, Section.KEYBOARD, "French Polished", PianoType.PIANOLA);
    }

    @Test
    public void canGETPIANOTYPE(){
        assertEquals(PianoType.PIANOLA, pianola.getPianoType());
    }

    @Test
    public void pianoTypeAffectsPlayMethod(){
        assertEquals("Inserts piano roll, pedals bellows, adjusts play speed, flicks switch", pianola.play());
    }

}
