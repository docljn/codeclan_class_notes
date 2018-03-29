import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Tina", "AB123456C", 45000, "Admin", 10000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000, director.getBudget(), 0.01);
    }
}
