package diamond;

interface LandVehicle{
	default void startEngine() {System.out.println("Land vehicle engine started");}
}
interface WaterVehicle{
	default void startEngine() {System.out.println("Water vehicle engine started");}
}
class AmphibiousCar implements LandVehicle, WaterVehicle{
	public void startEngine() {
		LandVehicle.super.startEngine();
		WaterVehicle.super.startEngine();
		System.out.println("AmphibiousCars ready to race!");
}}
public class Car {

	public static void main(String[] args) {
		AmphibiousCar ac = new AmphibiousCar();
		ac.startEngine();
	}
}
