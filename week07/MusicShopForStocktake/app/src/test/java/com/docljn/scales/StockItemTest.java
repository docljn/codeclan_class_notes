package com.docljn.scales;

import com.docljn.scales.Instruments.Section;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lornanoble on 21/01/2018.
 */
public class StockItemTest {

    StockItem flute;

    @Before
    public void before(){
        flute = new StockItem("Yamaha", 150, 300, Section.WOODWIND, "Silver plate flute with mother of pearl inlays");
    }
    @Test
    public void getBrand() throws Exception {
        assertEquals("Yamaha", flute.getBrand());
    }

    @Test
    public void getSellingPrice() throws Exception {
        assertEquals(300, flute.getSellingPrice(), 0.001);
    }

    @Test
    public void getPurchasePrice() throws Exception {
        assertEquals(150, flute.getPurchasePrice(), 0.001);
    }

    @Test
    public void getSection() throws Exception {
        assertEquals(Section.WOODWIND, flute.getSection());
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("Silver plate flute with mother of pearl inlays", flute.getDescription());

    }

    @Test
    public void setBrand() throws Exception {
    }

    @Test
    public void setSellingPrice() throws Exception {
    }

    @Test
    public void setPurchasePrice() throws Exception {
    }

    @Test
    public void getMarkup() throws Exception {
    }

}