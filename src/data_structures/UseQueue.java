package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
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

        sql.insertList(tableName, columnName, Collections.singletonList(restaurantLine));

        String query= "SELECT * FROM Restaurant_Line";

        try {
            columnName= String.valueOf(sql.executeQueryReadAll(query));
        } catch (
            SQLException e) {
    e.printStackTrace();
            }
            System.out.println(columnName);
        }
    }

