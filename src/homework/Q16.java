package homework;

import java.util.Scanner;

/**
 *16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO
 */
public class Q16 {
    public static void main(String[] args) {


        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        } else {
            System.out.println(number+ " is zero" );
        }


























    }

    }
