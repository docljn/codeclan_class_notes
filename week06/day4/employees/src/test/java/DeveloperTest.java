import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Me", "999", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Me", developer.getName());
    }

    @Test
    public void hasNINO(){
        assertEquals("999", developer.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(7000);
        assertEquals(27000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(200, developer.getBonus(), 0.01);
    }



}
