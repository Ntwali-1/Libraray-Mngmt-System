import java.util.ArrayList;
import java.util.List;

public class Staff extends Person {

    public Staff(String id, String name) {
        super(id, name);
    }

    List<Book> books = new ArrayList<Book>();
    public void manageBook(List<Book> books, Book book, boolean add) {
        if(add){
            books.add(book);
            System.out.println("Book added");
        }else {
            books.remove(book);
            System.out.println("Book Removed");
        }
    }
}
