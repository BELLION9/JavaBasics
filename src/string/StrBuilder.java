package string;

public class StrBuilder {

	public static void main(String[] args) throws InterruptedException{
		StringBuilder sb = new StringBuilder();
		Runnable StringBuilder = new Runnable() {
			public void run() {
				for (int i= 0; i<1000; i++) {
					sb.append("a");
}}};
	Thread t1 = new Thread(StringBuilder);
	Thread t2 = new Thread(StringBuilder);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.print(sb.length());
	}

}
