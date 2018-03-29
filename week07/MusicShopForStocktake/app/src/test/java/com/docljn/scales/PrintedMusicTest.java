package com.docljn.scales;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.docljn.scales.Instruments.Section;
import com.docljn.scales.PrintedMusicItems.PrintedMusic;




/**
 * Created by lornanoble on 19/01/2018.
 */

public class PrintedMusicTest {

    private PrintedMusic musicBook;

    @Before
    public void before(){

        musicBook = new PrintedMusic("Book", 5.00, 12.99, Section.KEYBOARD, "The Well Tempered Clavichord");
    }

    @Test
    public void returnsName(){
        assertEquals("Book", musicBook.getBrand());
    }

    @Test
    public void canSetName(){
        musicBook.setBrand("Booklet");
        assertEquals("Booklet", musicBook.getBrand());
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
