/*
- interfaces can be assigned without inheritance
- can have multiple interfaces implemented
- an interface has NO properties, and NO attributes
 */

/*
NAMING an interface:
Older convention: IPeripheral
Newer convention: Peripherable
 */

/*
METHODS:
All interface methods MUST be ABSTRACT
Public by default
 */

/*
IMPLEMENTATION
All interface methods MUST be IMPLEMENTED
As a result, keep your interface minimal
- better to have many simple interfaces than one large one
You can have a class which inherits from a superclass AND implements interface(s)
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesTest {

    Printer printer;


    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void printerConnects(){
        assertEquals("connected", printer.connect());
    }

    @Test
    public void mouseConnects(){
        Mouse mouse = new Mouse();
        assertEquals("Mouse connected", mouse.connect());
    }

    @Test
    public void printerCanPrint(){
        assertEquals("Printing data", printer.print("data"));
    }

    @Test
    public void canConnectAsPeripheral(){
        IPeripheral device = new Printer();
        assertEquals("connected", device.connect());
        // assertEquals("Printing data", device.print("data")); WILL NOT COMPILE


        /*
        Although device is a printer, we have declared it as an IPeripheral type
        We have NO access to Printer methods
        We DO have access to IPeripheral methods
        */

    }


    /*
    NOTE: This would work in a superclass COMPUTER:
        void connectDevice(IPeripheral device){
            device.connect();
        }
        Sets expected behaviour of element passed into method
        - the method can accept any class that implements the IPeripheral interface
        - e.g. printer, mouse, keyboard, monitor classes

        void connectMultipleDevice(ArrayList<IPeripheral> devices){
            some loop
        }
     */



}
