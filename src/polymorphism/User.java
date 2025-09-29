package polymorphism;

public class User {
    protected String name;
    protected String userID;
    protected int borrowedBooks;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = 0;
    }
    public void borrowBook(String bookName) {
        borrowedBooks++;
        System.out.println(name + " borrowed: " + bookName + ". Total borrowed: " + borrowedBooks);
    }
    public void borrowBook(String bookName, int quantity) {
        borrowedBooks += quantity;
        System.out.println(name + " borrowed " + quantity + " copies of: " + bookName + ". Total borrowed: " + borrowedBooks);
    }
    public void returnBook(int quantity) {
        borrowedBooks -= quantity;
        if (borrowedBooks < 0) borrowedBooks = 0;
        System.out.println(name + " returned " + quantity + " books. Total borrowed: " + borrowedBooks);
    }
    public void displayInfo() {
        System.out.println("User: " + name + ", ID: " + userID + ", Total borrowed books: " + borrowedBooks);
    }
}
class Students extends User {
    private static final int MAX_BORROW = 5;
    public Students(String name, String userID) {
        super(name, userID);
    }
    public void borrowBook(String bookName) {
        if (borrowedBooks < MAX_BORROW) {
            super.borrowBook(bookName);
        } else {
            System.out.println(name + " has reached the maximum limit of " + MAX_BORROW + " books.");
        }
    }
    public void borrowBook(String bookName, int quantity) {
        if (borrowedBooks + quantity <= MAX_BORROW) {
            super.borrowBook(bookName, quantity);
        } else {
            System.out.println(name + " cannot borrow " + quantity + " books. Max limit is " + MAX_BORROW);
}}}
class Faculty extends User {
    private static final int MAX_BORROW = 10;
    public Faculty(String name, String userID) {
        super(name, userID);
    }
    public void borrowBook(String bookName) {
        if (borrowedBooks < MAX_BORROW) {
            super.borrowBook(bookName);
        } else {
            System.out.println(name + " has reached the maximum limit of " + MAX_BORROW + " books.");
        }
    }
    public void borrowBook(String bookName, int quantity) {
        if (borrowedBooks + quantity <= MAX_BORROW) {
            super.borrowBook(bookName, quantity);
        } else {
            System.out.println(name + " cannot borrow " + quantity + " books. Max limit is " + MAX_BORROW);
}}}