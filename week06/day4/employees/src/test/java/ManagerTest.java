import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Tina", "AB123456C", 45000, "Admin");
    }

    @Test
    public void hasName(){
        assertEquals("Tina", manager.getName());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Admin", manager.getDeptName());
    }
}
