package encapsulation;

class Details{
	private String title;
	private String author;
	private int isbn;
	private int availableCopies;
	Details(String t, String a, int i, int c){
		this.title= t;
		this.author =a;
		this.isbn = i;
		this.availableCopies = c;
	}
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public int getIsbn() {return isbn;}
	public int getAvailableCopies() {return availableCopies;}
	public boolean borrowBook() {
		if(availableCopies> 0) {
			availableCopies--;
			System.out.println("Book Borrowed: "+title);
			return true;
		}else System.out.println("No copies available for the title: "+title);
		return false;
	}
	public void returnBook() {
		availableCopies++;
		System.out.println("Book returned: "+ title);
	}
	public void displayInfo() {
		System.out.println("The book "+getTitle() +" was written by "+getAuthor()+ ",ISBN no. "+getIsbn()+". Copies available: "+getAvailableCopies());}
}
public class Book {
	public static void main(String[] args) {
		Details d= new Details("Krishna and his Leela", "Vyedavyasa", 1234567,10);
		d.displayInfo();
		d.borrowBook();
		d.borrowBook();
		d.returnBook();
		d.displayInfo();
		
	}
}
