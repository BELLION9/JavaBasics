package inheritance;

public class Teacher extends User {
    private static final int MAX_BORROW = 10;

    public Teacher(String name, String userID) {
        super(name, userID);
    }
    public boolean borrowBook() {
        if (borrowedBooks < MAX_BORROW) {
            borrowedBooks++;
            System.out.println(name + " borrowed a book. Total borrowed: " + borrowedBooks);
            return true;
        } else {
            System.out.println(name + " has reached the maximum limit of " + MAX_BORROW + " books.");
            return false;
        }
    }
}
