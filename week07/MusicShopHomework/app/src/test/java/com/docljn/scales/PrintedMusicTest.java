package com.docljn.scales;

import com.docljn.scales.Instruments.Section;
import com.docljn.scales.PrintedMusicItems.PrintedMusic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 19/01/2018.
 */

public class PrintedMusicTest {

    private PrintedMusic musicBook;

    @Before
    public void before(){
        musicBook = new PrintedMusic("Book", 5.00, 12.99, Section.KEYBOARD);
    }

    @Test
    public void returnsName(){
        assertEquals("Book", musicBook.getName());
    }

    @Test
    public void canSetName(){
        musicBook.setName("Booklet");
        assertEquals("Booklet", musicBook.getName());
    }

    @Test
    public void returnsSellingPrice(){
        assertEquals(12.99, musicBook.getSellingPrice(), 0.001);
    }

    @Test
    public void canSetSellingPice(){
        musicBook.setSellingPrice(13.99);
        assertEquals(13.99, musicBook.getSellingPrice(), 0.001);
    }



    @Test
    public void returnsPurchasePrice(){
        assertEquals(5.00, musicBook.getPurchasePrice(), 0.001);
    }

    @Test
    public void canSetPurchasePrice(){
        musicBook.setPurchasePrice(3.00);
        assertEquals(3.00, musicBook.getPurchasePrice(), 0.001);
    }

    @Test
    public void calculatesMarkup(){
        assertEquals(7.99, musicBook.getMarkup(), 0.001);
    }

    @Test
    public void returnsLinkedSection(){
        assertEquals(Section.KEYBOARD, musicBook.getSection());
    }

}
