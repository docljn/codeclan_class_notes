package com.docljn.scales;

import com.docljn.scales.Instruments.Section;


/**
 * Created by lornanoble on 20/01/2018.
 */

public class StockItem {

    private  String brand;
    private  double purchasePrice;
    private  double sellingPrice;
    private Section section;
    private String description;

    public StockItem(String brand, double purchasePrice, double sellingPrice, Section section, String description){
        this.brand = brand;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.section = section;
        this.description = description;
    }

    public String getBrand() {
        return this.brand;

    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }


    public double getMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }

    public Section getSection() {
        return this.section;
    }

    public String getDescription() {
        return this.description;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
