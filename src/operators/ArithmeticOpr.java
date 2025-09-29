package operators;
import java.util.*;
public class ArithmeticOpr {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter x: ");
	int x = sc.nextInt();
	System.out.print("Enter y: ");
	int y = sc.nextInt();
	System.out.println(x + y);
	System.out.println(x - y); 
	System.out.println(x * y); 
	System.out.println(x / y); 
	System.out.println(x % y);
	float c = 10.0f;
	double d = 3.0d;
	System.out.println(c / d);
	System.out.print("Enter z: ");
	int z = sc.nextInt();
	z++;
	System.out.println(z);
	z--;
	System.out.println(z);
	
	
	sc.close();
}}
