package string_problems;

import java.util.Locale;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String lowerCaseString = st.toLowerCase();
        String[] removePunctuation = lowerCaseString.split("\\.");
        String myString = String.join("", removePunctuation);
        String[] finalArray = myString.split(" ");

        for (int i = 0; i < finalArray.length; i++) {
            int count = 1;

            for(int j= i+1; j< finalArray.length; j++){

                if (finalArray[i].equals(finalArray[j])){
                    count++;
                    finalArray[j] = "-1";
                }
                }
            if(count > 1 && (!(finalArray[i].equals("-1")))){
                System.out.println(finalArray[i] + " showedup " + count + "times" );
            }
            }

}
    }

