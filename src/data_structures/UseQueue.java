package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.*;

import static java.util.List.of;

public class UseQueue {

    /**
     * INSTRUCTIONS
     * <p>
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     * <p>
     * Store and retrieve data from/to a database table.
     */

    public static void main(String[] args) {
        Queue<String> restaurantLine = new LinkedList<>();
        restaurantLine.add("Cindy");
        restaurantLine.add("Clara");
        restaurantLine.add("Michael");
        restaurantLine.add("Jared");
        restaurantLine.add("Sam");

        System.out.println("Initial Queue: " + restaurantLine);
        restaurantLine.peek();
        System.out.println("Peeking at: " + restaurantLine.peek());

        restaurantLine.remove("Michael");
        System.out.println("After removal: " + restaurantLine);

        restaurantLine.poll();
        System.out.println("Final Queue after Poll: " + restaurantLine);

        Queue<String> letters = new LinkedList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");

        Iterator iterator = letters.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        for (String s : letters) {
            System.out.println(s + " ");
        }
        String tableName = "Restaurant_Line";
        String columnName = "name";
        SharedStepsDatabase sql = new SharedStepsDatabase();

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add (10);
        pQueue.add (20);
        pQueue.add (30);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.peek());

    }
}

