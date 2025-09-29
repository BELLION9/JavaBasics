package inheritance;

public class Library {
    public static void main(String[] args) {
        Student student = new Student("Krish", "S1");
        Teacher teacher = new Teacher("Nikhil", "T1");

        student.borrowBook();
        student.borrowBook();
        teacher.borrowBook();
        teacher.borrowBook();
        student.returnBook();
        teacher.returnBook();
        student.displayInfo();
        teacher.displayInfo();
    }
}
