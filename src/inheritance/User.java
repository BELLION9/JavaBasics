package inheritance;

public class User {
    protected String name;
    protected String userID;
    protected int borrowedBooks;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = 0;
    }
    public boolean borrowBook() {
        borrowedBooks++;
        System.out.println(name + " borrowed a book. Total borrowed: " + borrowedBooks);
        return true;
    }
    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.println(name + " returned a book. Total borrowed: " + borrowedBooks);
        } else {
            System.out.println(name + " has no books to return.");
        }
    }
    public void displayInfo() {
        System.out.println("User: " + name + ", ID: " + userID + ", Books borrowed: " + borrowedBooks);
    }
}
