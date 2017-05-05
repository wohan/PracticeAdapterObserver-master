package Library.models;

import java.awt.print.Book;
import java.util.*;

/**
 * Created by wnb on 05.04.2017.
 */
public class Library {
    private Set<Book> catalog;
    private Set<BookInstance> store;
    private Set<Reader> readers;
    private Set<Booking> bookings;

    public Library(){
        catalog = new HashSet<>(1024);
        store = new HashSet<>(4096);
        readers = new HashSet<>(512);
        bookings = new HashSet<>(2048);

    }

    public void buyBook(String title, String author, String isbn, int quatity, int year){
        Book newBook = new Book(author, title, year, isbn);
        catalog.add(newBook);
        for (int i=0; i< quatity;i++){
        BookInstance bookInstance = new BookInstance(newBook, UUID.randomUUID());
        store.add(bookInstance);}
    }


    public void takeBook(String firstName, String secondName, String lastNumber, long passportNumper,
                         String title){
        Reader reader = (Reader) readers.stream().filter((r)->r.getPassportNumber()==passportNumper).toArray()[0];
        //Reader reader = new Reader(firstName,secondName,lastNumber,passportNumper);
        if(reader==null)
            reader=new Reader(firstName,secondName,lastName, passportNumper);
            readers.add(reader);

    }
    BookInstance bookInstance =(BookInstance) store.stream().filter((s)->s.getBook().getTitle().equals(title));
    if(bookInstance == null){}

    Booking booking = new Booking(bookInstance, readers,new Date(), new Date());

    public returnBook(String firstName, String)

        if (booking ==null){
        System.out.println("No such booking");
        return;
    }
    store.add(booking.getBookIntance())

    public void showALLDate(){
            for (Book book:catalog) System.out.println(book);
            for(BookInstance bookInstance:store) System.out.println(bookInstance);
            for(Reader reader:readers) System.out.println(reader);
            for(Booking booking:bookings) System.out.println(bookings);
    }


}
