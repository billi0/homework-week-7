package homework;
/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= src.nextInt();

        String strOutput = (number % 2== 0) ? "even" : "odd" ;
        System.out.println(number + " is "  + strOutput);
        src.close();

    }
}
