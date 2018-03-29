package com.docljn.scales;

import java.util.ArrayList;

/**
 * Created by lornanoble on 19/01/2018.
 */

class Shop {

    private String shopName;
    private ArrayList<StockItem> stock;
    private double cashCount;
    private double bankBalance;


    public Shop(String shopName) {
        this.shopName = shopName;
        this.cashCount = 0.00;
        this.stock = new ArrayList<>();
        this.bankBalance = 0.00;

    }

    public String getName() {
        return this.shopName;
    }

    public double getCashCount() {
        return this.cashCount;
    }

    public int getStockCount() {
        return this.stock.size();
    }


    public double getBankBalance() {
        return this.bankBalance;
    }



    public void buy(StockItem stockItem) {
        if(this.bankBalance >= stockItem.getPurchasePrice()){
            this.bankBalance -= stockItem.getPurchasePrice();
            this.stock.add(stockItem);
        }

    }

    public void sell(StockItem stockItem) {

        if(inStock(stockItem)) {

            this.cashCount += stockItem.getSellingPrice();
            this.stock.remove(stockItem);
        }
    }

    private boolean inStock(StockItem stockItem) {
        return this.stock.contains(stockItem);
    }


    public double getMarkup(StockItem stockItem) {
        return stockItem.getSellingPrice() - stockItem.getPurchasePrice();
    }

    public double getMaxProfit() {
        double maxProfit = 0;
        for (StockItem item: this.stock) {
            maxProfit += item.getMarkup();
        }
        return maxProfit;
    }


    public void invest(double investmentAmount) {
        this.bankBalance += investmentAmount;
    }

    public void depositCash() {
        this.bankBalance += getCashCount();
        this.cashCount = 0.00;
    }


//    TODO: Remember to CAST if you want to use method specific to any of the subclasses of StockItem

//    TODO: Find out how you would search for an item in stock, and then cast to get the actual item?
}
