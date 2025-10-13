package collection_framework;

import java.util.*;

public class Ticket {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");

        System.out.println("Queue: " + queue);
        System.out.println("Next to be served: " + queue.peek());

        System.out.println("Customer served: "+queue.poll());
        System.out.println("After serving one: " + queue);
    }
}
