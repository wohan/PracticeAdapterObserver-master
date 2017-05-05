package Library.models;

/**
 * Created by wnb on 05.04.2017.
 */
public class Book {

    private String authors;
    private String titile;
    private int year;
    private String isbn;
    private isbn

    @Override
    public int hashCode(){
        return super hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null)
            return false;
        if(!(obj instanceof Book))
            return false;
        if((this.isbn.equals(((Book) obj).isbn)))
            return false;
        return true;
    }

    public String getTitile() {
        return titile;
    }
}
