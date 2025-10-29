public class Student extends Person {
    private String department;

    public Student(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void borrowBook (Book b){
        if(b.getIsAvailable() == true){
            System.out.println("Book is available and borrowed");
        }else {
            System.out.println("Book is not available");
        }
    }
}
