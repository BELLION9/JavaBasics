package inheritance;

public class Library {
    public static void main(String[] args) {
        Student student = new Student("Krish", "S1");

        student.borrowBook();
        student.borrowBook();
        student.returnBook();
        student.displayInfo();
    }
}
