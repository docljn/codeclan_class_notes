package com.docljn.scales.Spares;

import com.docljn.scales.Spares.Reeds.ClarinetReed;
import com.docljn.scales.Spares.Reeds.ClarinetReedNumber;
import com.docljn.scales.Spares.Reeds.ClarinetReedType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ReedTest {

    private ClarinetReed reedBb;

    @Before
    public void before(){
        reedBb = new ClarinetReed("Yamaha", 1.50, 3.50, ClarinetReedType.B_FLAT, ClarinetReedNumber.FIVE);
    }

    @Test
    public void returnsType(){
        assertEquals(ClarinetReedType.B_FLAT, reedBb.getClarinetReedType());
    }

    @Test
    public void returnsNumber(){
        assertEquals(ClarinetReedNumber.FIVE, reedBb.getClarinetReedNumber());
    }
}
