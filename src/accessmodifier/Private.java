package accessmodifier;

class PrivateExample {
    private int data = 11;

    public void showData() {
        System.out.println(data);
    }
}
public class Private {

	public static void main(String[] args) {
		 PrivateExample obj = new PrivateExample();
		 obj.showData();

	}

}
