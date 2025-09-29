package data_types;
import java.util.*;
public class DataTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sno: ");
		int sno = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Initial: ");
		char initial = sc.next().charAt(0);
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		System.out.print("R U Intern: ");
		boolean intern = sc.nextBoolean();
		System.out.print("Bonus Expected: ");
		float bonus = sc.nextFloat();
		System.out.println("\nDetails");
		System.out.println("Sno: "+sno);
		System.out.println("Name: "+name +"." +initial);
		System.out.println("Salary: "+salary);
		System.out.println("Year End: "+(salary*12 +bonus));
		System.out.println("Intern: "+intern);
		sc.close();

	}

}
