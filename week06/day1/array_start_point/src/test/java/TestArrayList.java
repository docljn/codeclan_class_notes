import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArrayList {

    ArrayListExample arrayListExample;

    @Before
    public void before(){
        arrayListExample = new ArrayListExample();
    }

    @Test
    public void hasLength(){
        assertEquals(0, arrayListExample.getWordCount());
    }

    @Test
    public void canAddItem(){
        arrayListExample.addWord("Hello");
        assertEquals(1, arrayListExample.getWordCount());
    }

    @Test
    public void getWordAtIndex(){
        arrayListExample.addWord("Hello");
        assertEquals("Hello", arrayListExample.getWordAtIndex(0));
    }
}
