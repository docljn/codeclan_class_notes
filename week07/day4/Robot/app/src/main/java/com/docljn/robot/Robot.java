package com.docljn.robot;

/**
 * Created by lornanoble on 18/01/2018.
 */

class Robot {

    private double batteryLevel;
    private String name;
    private String colour;

    public Robot(String name, String colour) {


        this.name = name;
        this.colour = colour;
        this.batteryLevel = 100.0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double checkBattery() {
        return this.batteryLevel;
    }

    public boolean sufficientBattery(double chargeUsed) {
        return checkBattery() >= chargeUsed;
    }



    public String makeDrink(String drink) {
        double chargeNeeded = 10;
        if (sufficientBattery(chargeNeeded)) {
            dischargeBattery(chargeNeeded);
            return "I am making " + drink;
        } else {
            return insufficientCharge();
        }
    }


    public String washDishes() {
        double chargeNeeded = 30;
        if (sufficientBattery(chargeNeeded)) {
            dischargeBattery(chargeNeeded);
            return "I am washing the dishes";
        } else {
            return insufficientCharge();
        }
    }

    public String doDusting() {
        double chargeNeeded = 20;
        if (sufficientBattery(chargeNeeded)) {
            dischargeBattery(chargeNeeded);
            return "I am dusting";
        } else {
            return insufficientCharge();
        }
    }

    public void rechargeBattery() {
        this.batteryLevel = 100;
    }

    public void dischargeBattery(double chargeUsed) {
        this.batteryLevel -= chargeUsed;
    }

    public String insufficientCharge(){
        return "Not enough battery";
    }


}
