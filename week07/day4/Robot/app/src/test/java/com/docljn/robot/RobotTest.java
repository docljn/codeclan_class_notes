package com.docljn.robot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 18/01/2018.
 */

public class RobotTest {

    Robot robot;

    @Before
    public void before() {
        robot = new Robot("Hal", "Black");
    }

    @Test
    public void getsName() {
        assertEquals("Hal", robot.getName());
    }

    @Test
    public void setsName() {
        robot.setName("R2D2");
        assertEquals("R2D2", robot.getName());
    }

    @Test
    public void getsColour() {
        assertEquals("Black", robot.getColour());
    }

    @Test
    public void setsColour() {
        robot.setColour("Silver");
        assertEquals("Silver", robot.getColour());
    }

    @Test
    public void checksBatteryLife(){
        assertEquals(100.0, robot.checkBattery(), 0.01);
    }

    @Test
    public void makesDrink(){
        assertEquals("I am making tea", robot.makeDrink("tea"));
    }

    @Test
    public void makesDrinkReducesBattery(){
        robot.makeDrink("Coffee");
        assertEquals(90, robot.checkBattery(), 0.01);
    }

    @Test
    public void washesDishes(){
        assertEquals("I am washing the dishes", robot.washDishes());
    }

    @Test
    public void washingDishesReducesBattery(){
        robot.washDishes();
        assertEquals(70, robot.checkBattery(), 0.01);
    }

    @Test
    public void doesDusting(){
        assertEquals("I am dusting", robot.doDusting());
    }

    @Test
    public void dustingReducesBattery(){
        robot.doDusting();
        assertEquals(80, robot.checkBattery(), 0.01);
    }

    @Test
    public void canRechargeBattery(){
        robot.doDusting();
        robot.rechargeBattery();
        assertEquals(100, robot.checkBattery(), 0.01);
    }

    @Test
    public void taskRequiresEnoughBattery(){
        robot.dischargeBattery(90);
        robot.doDusting();
        assertEquals(10, robot.checkBattery(), 0.01);
    }


}
