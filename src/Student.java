public class Student extends Person {
    private String department;

    public Student(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void borrowBook (Book b){
        if(b.getIsAvailable()){
            System.out.println("Book is available and borrowed");
        }else {
            System.out.println("Book is not available");
        }
    }
}
