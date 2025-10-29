import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Animal-Farm","Ntwali"));
        books.add(new Book("Home Alone","Yanis"));

        Student s1 = new Student("1","John", "IT");
        s1.borrowBook(books.get(0));
    }
}