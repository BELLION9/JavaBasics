//Exception propagation across multiple methods until handled in main()
package exception_handling;

public class PropagationExcep {
    private static String s;

	static void level3() {
        s = null;
        s.length(); 
    }
    static void level2() {
    	level3();
    }
    static void level1() {
    	level2();
    }
    
    public static void main(String[] args) {
        try {
            level1();
            System.out.println("This will not print");
        } catch (NullPointerException e) {
            System.out.println("Handled in main: " + e);
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(" at " + ste);
                break; 
            }
        }
    }
}