import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("John", false);
    }

    @Test
    public void canGetName(){
        assertEquals("John", guest.getName());
    }

    @Test
    public void canGetDataProtectionStatus(){
        assertEquals(false, guest.getDataPermission());
    }

    @Test
    public void canSetName (){
        guest.setName("Jack");
        assertEquals("Jack", guest.getName());
    }

    @Test
    public void canSetSDataProtectionStatus (){
        guest.setDataPermission(true);
        assertEquals(true, guest.getDataPermission());
    }


//    @Test
//    public void name (){
//        assertEquals();
//    }






}
