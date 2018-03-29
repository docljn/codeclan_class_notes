package com.docljn.scales.Spares;

import com.docljn.scales.Instruments.Section;
import com.docljn.scales.Spares.Strings.ViolaString;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class StringTest {

    ViolaString string;

    @Before
    public void before() {
        string = new ViolaString("CatGut", 0.50, 1.99, Section.SUNDRIES, "Viola A String", Pitch.A );
    }

    @Test
    public void canGetPitch(){
        assertEquals(Pitch.A, string.getPitch());
    }



}
