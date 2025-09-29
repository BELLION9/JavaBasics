package abstraction;
abstract class User {
    protected String name;
    protected String userID;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }
    public abstract void borrowBook();
    public void displayInfo() {
        System.out.println("User: " + name + ", ID: " + userID);
    }
}
class Student extends User {
    public Student(String name, String userID) {
        super(name, userID);}
    public void borrowBook() {
        System.out.println(name + " borrowed a book as a Student.");
}}
class Teacher extends User {
    public Teacher(String name, String userID) {
        super(name, userID);
    }
    public void borrowBook() {
        System.out.println(name + " borrowed a book as a Teacher.");
}}
