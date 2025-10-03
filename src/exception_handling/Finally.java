//Show that finally block always executes, even if an exception occurs.
package exception_handling;

public class Finally {
static int divide(int a ,int b ) {
	try {int result = a/b;
	System.out.println("Result = " + result);
    return result;
    }catch(ArithmeticException e) {
        System.out.println("In catch: " + e);
        return -1;}
	finally {System.out.println("Always executes");
}}
	public static void main(String[] args) throws ArithmeticException {
		int r1 = divide(10,0);
		System.out.println(r1);
		int r2 = divide(10,5);
		System.out.println(r2);
}}
