package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        SharedStepsDatabase ssdb= new SharedStepsDatabase();

        List<String> carList= new ArrayList();

        carList.add("Audi");
        carList.add("BMW");
        carList.add("Mercedes");
        System.out.println("Initial ArrayList: " + carList);

        carList.remove("Audi");
        System.out.println("After removal: " + carList);

        String tableName = "Cars";
        String columnname = "car_make";

        ssdb.insertList ( tableName, columnname, carList);

        String query= "SELECT * FROM Cars";
        try {
            carList = ssdb.executeQueryReadAllSingleColumn(query, " ");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(carList);

        }


    }

}
