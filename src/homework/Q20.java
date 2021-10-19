package homework;

import java.util.Arrays;
import java.util.List;

/**
 * Write a Java program to test if an array contains a specific value
 */

public class Q20 {
    public static class StringArrayExample1 {

        public static void main(String[] args) {

            String[] alphabet = new String[]{"A", "B", "C"};

            // Convert String Array to List
            List<String> list = Arrays.asList(alphabet);

            if(list.contains("A")){
                System.out.println("Hello A");
            }

        }

    }
}
