package homework;
/**
 * Same as above program-8 using switch statement.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any letter from A to F");
        String letter = input.next();

        switch (letter){
            case "A":
                System.out.println("Amsterdam");
                break;
            case "B":
                System.out.println("Berlin");
                break;
            case "c":
                System.out.println("Columbia");
                break;
            case "D":
                System.out.println("Dublin");
                break;
            case "E":
                System.out.println("Edinburg");
                break;
            case "F":
                System.out.println("Frenso");
                input.close();
        }

    }
}
