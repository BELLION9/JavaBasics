package multi_threading;
// run, start, join, sleep, priority
class DeliveryTask extends Thread{
	private String taskname;
	DeliveryTask(String name){
		this.taskname = name;}
	public void run() {
		System.out.println(taskname+" Started by "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.getStackTrace();
		}System.out.println(taskname+" Completed by "+Thread.currentThread().getName());
	}
}
public class FoodDelivery {

	public static void main(String[] args) throws InterruptedException {
		Thread orderThread = new DeliveryTask("Ordering Food");
		Thread cookThread = new DeliveryTask("Cooking Food");
		Thread deliveryThread = new DeliveryTask("Delivering Food");
		orderThread.setPriority(Thread.MAX_PRIORITY);
		cookThread.setPriority(Thread.NORM_PRIORITY);
		deliveryThread.setPriority(Thread.MIN_PRIORITY);
		orderThread.start();
		
		cookThread.start();
		
		deliveryThread.start();
		
	}
}
