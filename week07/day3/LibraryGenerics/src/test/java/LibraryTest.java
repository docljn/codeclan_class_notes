import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Library<Book> library;
    Library<Audio> audioLibrary;
    Library<Video> videoLibrary;
    Book book;
    Book book2;
    Audio cd;
    Video dvd;

    @Before
    public void before(){
        library = new Library<>("Book Library");
        book = new Book("1234");
        book2 = new Book("abcd");
        cd = new Audio();
        dvd = new Video();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.countHoldings());
    }

    @Test
    public void libraryAcceptsHolding(){
        library.add(book);
        assertEquals(1, library.getCatalogue().size());
    }

    @Test
    public void libraryAcceptsBookOnly(){
        library.add(book);
        assertEquals("1234", library.getCatalogue().get(0).getReference());
    }

    @Test
    public void libraryReturnsHoldingByReference(){
        library.add(book);
        library.add(book2);
        library.getHolding("abcd");

    }






}