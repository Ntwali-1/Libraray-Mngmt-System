import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();

        Book b1 = new Book("Hello", "Ntwali");

        Person p1 = new Staff("1", "John");
        ((Staff)p1).manageBook(books, b1, true);

        Student s1 = new Student("1","John", "IT");
        s1.borrowBook(books.get(0));

    }
}