package com.docljn.scales.Instruments;

import com.docljn.scales.Instruments.Horn;
import com.docljn.scales.Instruments.Instrument;
import com.docljn.scales.Instruments.Section;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 19/01/2018.
 */

public class InstrumentTest {

    private Instrument horn;

    @Before
    public void before(){
        horn = new Horn("French Horn", 70.00, 140.00, Section.BRASS, "Silver", 3);
    }


    @Test
    public void canGetName(){
        assertEquals("French Horn", horn.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(140.00, horn.getSellingPrice(), 0.001);
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(70, horn.getPurchasePrice(), 0.001);
    }


    @Test
    public void returnsDescription(){
        assertEquals("Silver", horn.getDescription());
    }

    @Test
    public void setsDescription(){
        horn.setDescription("Matte bronze");
        assertEquals("Matte bronze", horn.getDescription());
    }



}
