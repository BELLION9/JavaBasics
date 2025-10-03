package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String word = sc.nextLine();
		boolean palindrome = word.equals(new StringBuilder(word).reverse().toString());
		System.out.println("isPalindrome: "+palindrome);
		sc.close();

	}

}
