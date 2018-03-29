package com.docljn.scales;

/**
 * Created by lornanoble on 20/01/2018.
 */

public abstract class StockItem {

    public  String name;
    public  double purchasePrice;
    public  double sellingPrice;

    public StockItem(String name, double purchasePrice, double sellingPrice){
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return this.name;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    //    TODO: consider if you want to make name, purchase and selling price settable: Yes, in case of mistakes


    public void setName(String name) {
        this.name = name;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    public double getMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
