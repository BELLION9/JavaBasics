package polymorphism;

public class Library {
    public static void main(String[] args) {
        Students student = new Students("Krish", "S1");
        Faculty teacher = new Faculty("Nikhil", "T1");

        student.borrowBook("Java");
        student.borrowBook("Python", 3);

        teacher.borrowBook("Data Structures");
        teacher.borrowBook("Algorithms", 5);

        student.returnBook(1);
        teacher.returnBook(2);

        student.displayInfo();
        teacher.displayInfo();
    }
}