package com.docljn.scales;

import org.junit.Before;
import org.junit.Test;
import com.docljn.scales.Instruments.Section;
import com.docljn.scales.PrintedMusicItems.PrintedMusic;
import static org.junit.Assert.assertEquals;

/**
 * Created by docljn on 19/01/2018.
 */

public class ShopTest {


    Shop shop;
    private PrintedMusic musicBook;


    @Before
    public void before() {
        shop = new Shop("Scales");
        musicBook = new PrintedMusic("Book", 5.00, 12.99, Section.SUNDRIES, "Keyboard studies");
    }

    @Test
    public void returnsName(){
        assertEquals("Scales", shop.getName());
    }

    @Test
    public void startsWithNoStock(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddStock(){
        shop.invest(100.00);
        shop.buy(musicBook);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void saleReducesShopStock(){
        shop.invest(100.00);
        shop.buy(musicBook);
        shop.sell(musicBook);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void saleIncreasesShopCashByPrice(){
        shop.invest(100.00);
        shop.buy(musicBook);
        shop.sell(musicBook);
        assertEquals(12.99, shop.getCashCount(), 0.001);
    }

    @Test
    public void saleRequiresItemInStock(){
        shop.sell(musicBook);
        assertEquals(0.00, shop.getCashCount(), 0.001);
    }

    @Test
    public void canDetermineItemMarkup(){
        assertEquals(7.99, shop.getMarkup(musicBook), 0.001);
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.invest(100.00);
        shop.buy(musicBook);
        shop.buy(musicBook);
        assertEquals(15.98, shop.getMaxProfit(), 0.001);
    }

    @Test
    public void startsWithZeroBankBalance(){
        assertEquals(0.00, shop.getBankBalance(), 0.001);
    }

    @Test
    public void investingIncreasesBankBalance(){
        shop.invest(1000.00);
        assertEquals(1000.00, shop.getBankBalance(), 0.001);
    }

    @Test
    public void buyingStockDecreasesBankBalance(){
        shop.invest(1000);
        shop.buy(musicBook);
        assertEquals(995, shop.getBankBalance(), 0.001);
    }

    @Test
    public void depositingCashClearsCashCountIncreasesBankBalance(){
        shop.invest(1000);
        shop.buy(musicBook);
        shop.sell(musicBook);
        shop.depositCash();
        assertEquals(1007.99, shop.getBankBalance(), 0.001);
        assertEquals(0, shop.getCashCount(), 0.001);
    }

//    TODO: how to generate a stock list for stocktake? It would need to be ordered and numbered?





}
