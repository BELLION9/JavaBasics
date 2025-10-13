package collection_framework;

import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> shoppingList = new LinkedList<>();

        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Milk");

        System.out.println("Shopping List: " + shoppingList);
        System.out.println("First item: " + shoppingList.get(0));

        shoppingList.remove("Bread");
        System.out.println("After removing Bread: " + shoppingList);
    }
}

