package homework;
/**
 * 6. Write a java program that tells us that Input number is odd or even?
 *
 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even ");
        else
            System.out.println(num + " is odd ");
        reader.close();
    }
}
