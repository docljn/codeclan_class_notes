/*
Lab - Generics

Objectives

practice writing a generic class in Java.
Library class

Your task is to create a class to implement a simple library. A library can contain items of any type, but an instance of a library contains one type only e.g. it can only contain Books. Therefore you will need to make the class a generic class where you pass in the type of the item the library contains.

The library class should have methods to do the following:

add an new item to the library
get the number of items in the library
 */

import java.util.ArrayList;

public class Library<T> {

    String name;
    ArrayList<T> catalogue;

    public Library(String name) {
        this.name = name;
        this.catalogue = new ArrayList<>();
    }


    public void add(T holding) {
        this.catalogue.add(holding);
    }

    public int countHoldings(){
        return this.catalogue.size();
    }

    public ArrayList<T> getCatalogue() {
        return this.catalogue;
    }

    public void getHolding(String reference) {
//        create arraylist for found items of type T
//        iterate through catalogue
//        add anything with the correct reference to found items
//        return the arraylist
//        if you want to overload the method, reference should probably be int, and name a string...
    }
}
