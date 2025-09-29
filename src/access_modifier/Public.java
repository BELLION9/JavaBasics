package access_modifier;

class PublicEx {
    public int data = 10; 
}
public class Public {

	public static void main(String[] args) {
		 PublicEx obj = new PublicEx();
        System.out.println(obj.data);

	}

}
