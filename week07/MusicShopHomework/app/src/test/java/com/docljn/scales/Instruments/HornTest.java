package com.docljn.scales.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lornanoble on 20/01/2018.
 */
public class HornTest {


    private Horn horn;

    @Before
    public void before(){
        horn = new Horn("French Horn", 70.00, 140.00, Section.BRASS, "Silver", 3);
    }

    @Test
    public void canBePlayed(){
        assertEquals("Hoot hoot", horn.play());
    }

    @Test
    public void returnsValveNumber(){
        assertEquals(3, horn.getValveNumber());
    }



}