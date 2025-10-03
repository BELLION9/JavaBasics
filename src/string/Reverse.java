package string;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String word = sc.nextLine();
		System.out.println("Reverse of "+word+" is: "+new StringBuilder(word).reverse().toString());
		sc.close();
		
	}}
