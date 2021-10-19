package homework;
/**
 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 any other alphabet should be invalid entry
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        cityName.add("Ahmedabad");
        cityName.add("Berlin");
        cityName.add("Columbia");
        cityName.add("Dublin");
        cityName.add("Erbil");
        cityName.add("Fransco");
        System.out.println("Enter city name by letter ");
        String letter = input.next();

        if (letter.startsWith("A")){
            System.out.println("Ahmedabad");
        } else if (letter.startsWith("B")){
            System.out.println("Berlin");
        } else if (letter.startsWith("C")){
            System.out.println("Columbia");
        } else if ( letter.startsWith("D")){
            System.out.println("Dublin");
        } else if (letter.startsWith("E")){
            System.out.println("Erbil");
        } else if(letter.startsWith("F")){
            System.out.println("Fransco");
        }
    }
}
