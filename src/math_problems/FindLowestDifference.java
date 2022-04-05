package math_problems;

import java.util.Arrays;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */
static int findLowestDifference (int[]array1, int[]array2) {
    Arrays.sort(array1);
    Arrays.sort(array2);

    int a = 0, b = 0;

    while (a < array1.length && b < array2.length) {

        if (array1[a] == array2[b]) {
            return array1[a];

        }
        if (array1[a] > array2[b]) {
            b++;
        }
        if (array1[a] < array2[b]) {
            a++;
        }
    }
    return 1;
}
public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        System.out.println(findLowestDifference(array1,array2));
    }
}
