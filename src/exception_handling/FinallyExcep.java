package exception_handling;

public class FinallyExcep {

	public static void main(String[] args) {
		try {
		    int x = 10 / 0;
		    System.out.println(x);
		} catch (ArithmeticException e) {
			int z = 10 / 0;
			System.out.println(z);
		    System.out.println("Caught Exception: " + e);
		    
		} finally {
		    System.out.println("In finally block");
		    int y = 5 / 0; 
		    System.out.println(y);
}}}
