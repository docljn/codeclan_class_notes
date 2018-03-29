import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.beasts.Dragon;
import wizard_management.carpets.MagicCarpet;
import wizard_management.cleaning.Broomstick;
import wizard_management.cleaning.CleaningImplement;
import wizard_management.people.Wizard;


public class WizardTest {

    Wizard wizard;
    Broomstick broomstick;

    @Before
    public void before(){
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);
    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    // I don't want an IFlyable, I want to CAST that to be a Broomstick
    // I can do that if they are interconvertable types
    // cast as in mould : the return value of wizard.getRide() is converted into a Broomstick type object
    // you can ONLY do this because the initial object is actually a Broomstick, treated as an IFlyable by the constructor
    // an IFlyable doesn't have a brand, but a broomstick does

    public void hasBroomstick(){
        Broomstick ride = (Broomstick) wizard.getRide();
        assertEquals("Nimbus", ride.getBrand());
    }

    @Test
    /* You can also cast an object as its subclass: */
    public void hasRideBroomstick(){
        CleaningImplement ride = (CleaningImplement) wizard.getRide();
        assertEquals("Nimbus", ride.getBrand());
    }


    @Test
    public void canFly(){
        assertEquals("mounting broom, running, skipping, flying!", wizard.fly());
    }

    @Test
    public void canFlyDragon(){
        Dragon dragon = new Dragon("Puff");
        wizard = new Wizard("Toby", dragon);
        assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
    }

    @Test
    public void canFlyMagicCarpet(){
        MagicCarpet carpet = new MagicCarpet("Blue");
        wizard = new Wizard("Toby", carpet);
        assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
    }

    @Test
    public void canSetRide(){
        MagicCarpet carpet = new MagicCarpet("Blue");
        wizard.setRide(carpet);
        assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
    }
}
