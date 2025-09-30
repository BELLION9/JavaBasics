package abstraction;

public class Library {
    public static void main(String[] args) {
        User student = new Student("Krish", "S1");
        User teacher = new Teacher("Nikhil", "T1");

        student.borrowBook();  
        teacher.borrowBook();   
        student.displayInfo();
        teacher.displayInfo();
    }
}