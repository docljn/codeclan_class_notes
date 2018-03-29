package com.docljn.scales;

/**
 * Created by docljn on 19/01/2018.
 */

//apply this at the TOP of each heirarchy, and create the method there.
// You'll still have code duplication but at limit it
//    you might choose to calculate the buying and selling prices differently in the heirarchies?

public interface Sellable {

    double getSellingPrice();
    double getPurchasePrice();

//    TODO: consider if you want to make purchase and selling price settable,
    // or just adjustable by the shop based on discount levels, desired profit level etc


//    I want to add a default method here to calculate the markup, but that requires Java8
//    our AndroidStudio setup doesn't allow that.  BOTHER.

}
