package homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Q17 {
    public static void main(String[] args) {

        String[] myArray = {"c", "b", "a", "e", "d",};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] array = {45, 12, 85, 32, 89, 39,};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}