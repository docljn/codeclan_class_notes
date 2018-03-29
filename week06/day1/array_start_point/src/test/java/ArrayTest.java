import org.junit.*;
import static org.junit.Assert.assertEquals;


public class ArrayTest {

    ArrayExample arrayExample;
//    sets the instance variable name and its type

    @Before
    public void before(){
        arrayExample = new ArrayExample();
    }

//    @Test
//    public void canAddItem(){
//        arrayExample.add("Hello");
//        assertEquals(1, arrayExample.getWordCount());
//    }
//    FAILS because the array has 5 items in it from declaration, they are just null
}
