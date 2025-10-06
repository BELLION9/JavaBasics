package polymorphism;

public class Library {
    public static void main(String[] args) {
        Students student = new Students("Krish", "S1");

        student.borrowBook("Java");
        student.borrowBook("Python", 3);

        student.returnBook(1);
        student.displayInfo();
    }
}