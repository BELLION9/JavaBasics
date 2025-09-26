package keywords;

public class This {
	String company = "Caelius Consulting";
	String name;
	public This(String name) {this.name = name;}
	void showDetails() {
		System.out.println(name+ " works at "+company);
	}

	public static void main(String[] args) {
		This k = new This("Krish");
		k.showDetails();
}}
