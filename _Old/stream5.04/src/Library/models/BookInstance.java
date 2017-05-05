package Library.models;

import java.util.List;
import java.util.UUID;

/**
 * Created by wnb on 05.04.2017.
 */
public class BookInstance {
    private Book book;
    private UUID number;
    private List<Booking> bookingHistory;

    public BookInstance(Book book, UUID number) {
        this.book = book;
        this.number = number;
        this.bookingHistory = bookingHistory;
    }

    public int hashCode() {
        return number.hashCode();
    }

    public String toString(){
        return book+"@"+number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if ()
        return super.equals(obj);
    }

    public Book getBook() {
        return book;
    }
}

}
