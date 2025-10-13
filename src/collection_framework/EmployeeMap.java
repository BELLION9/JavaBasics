package collection_framework;

import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(1, "Alice");
        employees.put(2, "Bob");
        employees.put(3, "Charlie");

        System.out.println("Employee Map: " + employees);
        System.out.println("Employee with ID 2: " + employees.get(2));

        employees.remove(1);
        System.out.println("After removing ID 1: " + employees);
    }
}
