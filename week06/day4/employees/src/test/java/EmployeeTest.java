import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Employee("John", "AB000000T", 23000);
    }

    @Test
    public void hasName() {
        assertEquals("John", employee.getName());
    }

    @Test
    public void hasNINO(){
        assertEquals("AB000000T", employee.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(23000, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(7000);
        assertEquals(30000, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(230, employee.getBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        employee.setName("Joe");
        assertEquals("Joe", employee.getName());
    }

    @Test
    public void canChangeNi(){
        employee.setNi("AB123456C");
        assertEquals("AB123456C", employee.getNi());
    }

}
