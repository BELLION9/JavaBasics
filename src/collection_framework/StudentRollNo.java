package collection_framework;

import java.util.*;

public class StudentRollNo {
    public static void main(String[] args) {
        Set<Integer> studentRolls = new HashSet<>();

        studentRolls.add(101);
        studentRolls.add(102);
        studentRolls.add(103);
        studentRolls.add(101);

        System.out.println("Student Roll Numbers: " + studentRolls);
        System.out.println("Is roll 102 present? " + studentRolls.contains(102));

        studentRolls.remove(103);
        System.out.println("After removing 103: " + studentRolls);
    }
}
