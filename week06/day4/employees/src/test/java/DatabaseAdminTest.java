import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Me", "999", 20000);
    }


    @Test
    public void hasName() {
        assertEquals("Me", databaseAdmin.getName());
    }

    @Test
    public void hasNINO(){
        assertEquals("999", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(7000);
        assertEquals(27000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(200, databaseAdmin.getBonus(), 0.01);
    }

}
