package keywords;

final class Vehicle {
    final int speedLimit = 100;

    final void displayLimit() {
        System.out.println("Speed limit is: " + speedLimit);
}}

public class Final {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayLimit();
}}
