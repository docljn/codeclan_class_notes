package example.docljn.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by lornanoble on 22/01/2018.
 */

public class CounterTest {

    Counter counter;

    @Before
    public void before() {
        counter = new Counter();
    }

    @Test
    public void returnsWordCount(){
        assertEquals("2", counter.getWordCount("Hello World"));
    }

    @Test
    public void calculatesWordsWithCount(){
        HashMap<String, Integer> wordOccurrence = new HashMap<>();
        wordOccurrence.put("Hello", 1);
        wordOccurrence.put("World", 1);
        assertEquals(wordOccurrence, counter.getWordOccurrence("Hello World"));
    }

    @Test
    public void returnsStringOfWordsWithCount(){
        String output = "\"Hello\": 1, \"World\": 1";
        assertEquals(output, counter.outputWordsOccurrence("Hello World"));
    }

    @Test
    public void emptyStringIsOK(){
        String output = "";
        assertEquals(output, counter.outputWordsOccurrence(""));
    }
}
