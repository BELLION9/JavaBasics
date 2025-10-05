//Create a custom exception InvalidAgeException. Throw it when a user tries to register with age < 18
package exception_handling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {super(message);	}
}
public class CustomExcep {
public static void registerUser(String name, int age ) throws InvalidAgeException {
	if(age< 18) {
		throw new InvalidAgeException(name+ " is underage");
	}System.out.println("User: "+name+ " is registered");
}
	public static void main(String[] args){
		try {
			registerUser("Nikhil", 100);
		}catch(InvalidAgeException e) {

			System.out.println("Registration failed: " + e.getMessage());
		}
	}
}
