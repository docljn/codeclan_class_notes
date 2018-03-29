import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    DesktopComputer desktop;
    LaptopComputer laptop;

    @Before
    public void before() {
        desktop = new DesktopComputer();
        laptop = new LaptopComputer();
    }

    @Test
    public void desktopCanRunApplication(){
        assertEquals("IntelliJ Status: I am running IntelliJ", desktop.runApplication("IntelliJ"));
    }

    @Test
    public void laptopCanRunApplication(){
        assertEquals("IntelliJ Status: Program IntelliJ is running", laptop.RunApplication("IntelliJ"));
    }

    @Test
    public void desktopCanCloseApplication(){
        assertEquals("Closing down CC Caraoke", desktop.closeApplication("CC Caraoke"));
    }

    @Test
    public void laptopCanCloseApplication(){
        assertEquals("Program CC Caraoke is closing down", laptop.closeApplication("CC Caraoke"));
    }

    @Test
    public void desktopCanShutDown(){
        Computer computer = new DesktopComputer();
        assertEquals("Shutting down", computer.shutdown());
    }

    @Test
    public void laptopCanShutDown(){
        // CARE: a subclass can be instantiated in a variable of type superclass
        Computer computer = new LaptopComputer();
        assertEquals("Shutting down", computer.shutdown());
    }


    /*
    @Test
    should be in an operating system class
    CARE: a subclass can be instantiated in a variable of type superclass
    will work on both a desktop and a laptop computer
        public void printDetails(Computer computer){
        computer.printDetails();
        }
    */

}
