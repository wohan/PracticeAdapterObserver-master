package Test;

import library.Library;
import library.models.Book;
import library.models.BookInstance;
import library.models.Reader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



/**
 * Created by wnb on 10.04.2017.
 */
public class MainTest {
    @Test
    public void buyBookTestCatalog() {

        library.buyBook("Intro to Java", "Schildt", "1241241ada", 5, 2017);
        //library.getCatalog().size();
        assertEquals(1,library.getCatalog().size());
        Book book = new Book("Schildt", "Intro to Java", 2017,"1241241ada" );
        assertTrue(library.getCatalog().contains(book));
        Book bookFromCatalog = library.getCatalog().iterator().next();

        assertTrue(book.getTitle().equals(bookFromCatalog.getTitle()));
        assertTrue(book.getAuthor().equals(bookFromCatalog.getAuthor()));
        assertTrue(book.getIsbn().equals(bookFromCatalog.getIsbn()));
        assertTrue(book.getYear()==(bookFromCatalog.getYear()));

    }
    private static Library library;

    @Test
    public void buyBookTestStore(){
        library.buyBook("Intro to Java", "Schildt", "1241241ada", 5, 2017);
        //BookInstance bookInstance = new BookInstance();
        assertEquals(5,library.getStore().size());
        Book book = new Book("Schildt", "Intro to Java", 2017,"1241241ada" );

        for (BookInstance instance: library.getStore()){

            Book bookFromStore = instance.getBook();
            assertTrue(book.getTitle().equals(bookFromStore.getTitle()));
            assertTrue(book.getAuthor().equals(bookFromStore.getAuthor()));
            assertTrue(book.getIsbn().equals(bookFromStore.getIsbn()));
            assertTrue(book.getYear()==(bookFromStore.getYear()));

        }
    }

    @Test
    public void ReaderTest(){

        library.takeBook("John", "Connor", "Androidovich", 12345678,
         "Intro to Java");

        Reader john = new Reader("John", "Connor",
                "Androidovich", 12345678);

        for (Reader reader: library.getReaders()){

            assertTrue(john.getFirstName().equals(reader.getFirstName()));
            assertTrue(john.getLastName().equals(reader.getLastName()));
            assertTrue(john.getSecondName().equals(reader.getSecondName()));
            assertTrue(john.getPassportNumber()==(reader.getPassportNumber()));

        }
    }






    @BeforeClass
    public static void init(){
        library = new Library();
    }
    @AfterClass
    public void clearAll(){
        library=new Library();

    }
}
