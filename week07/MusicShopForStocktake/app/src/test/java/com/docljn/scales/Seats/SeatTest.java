package com.docljn.scales.Seats;

import com.docljn.scales.Instruments.Section;
import com.docljn.scales.Spares.Seat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class SeatTest {

    private Seat pianoStool;

    @Before
    public void before(){
        pianoStool = new Seat("Bechstein", 75, 150, Section.SUNDRIES, "Pine piano stool with black PVC padded seat", 50, true);
    }

    @Test
    public void returnsHeight(){
        assertEquals(50, pianoStool.getHeight());
    }

    @Test
    public void returnsAdjustability(){
        assertEquals(true, pianoStool.isAdjustable());
    }

}
