package string;

public class StrBuffer {

	public static void main(String[] args) throws InterruptedException{
		StringBuffer sbf = new StringBuffer();
		Runnable StringBuffer = () ->{for (int i = 0; i<1000;i++) sbf.append("a");};
	Thread t1 = new Thread(StringBuffer);
	Thread t2 = new Thread(StringBuffer);
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.print(sbf.length());
	}

}
