package homework;
/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student name : ");
        String name = in.next();
        System.out.println("Enter roll num :");
        int r = in.nextInt();
        System.out.println("Enter marks for science subject :");
        int s = in.nextInt();
        System.out.println("Enter marks for math subject :");
        int m = in.nextInt();
        System.out.println(" Enter marks for English subject :");
        int e = in.nextInt();
        int t = s + m + e;
        double p = t / 300.0 * 100.0;
        String g = "";
        if (p >= 88)
            g = "A+";
        else if (p >= 60)
            g = "A";
        else if (p >= 50)
            g = "B";
        else if (p >= 35)
            g = "Pass";
        in.close();
        System.out.println();
        System.out.println("Total marks = " + t);
        System.out.println("Percentage = " + p);
        System.out.println("Grade = " + g);

        System.out.println("--------------------------------------------------|");
        System.out.println("||                                                |");
        System.out.println("|Mark Sheet                                       |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("Name:\t" + name                                    );
        System.out.println("Rollnumber:\t" + r                                 );
        System.out.println("|-------------------------------------------------|");
        System.out.println("| subject:+english+Science+Maths;                 |");
        System.out.println("|------------------------------------------------ |");
        System.out.println("English:\t" + e                                    );
        System.out.println("Math:\t" + m                                       );
        System.out.println("Science:\t" + s                                    );
        System.out.println("|------------------------------------------------ |");
        System.out.println("Total marks=\t" + t                                );
        System.out.println("Total marks=\t" + p                                );
        System.out.println("Total marks=\t" + g                                );
        System.out.println("|------------------------------------------------ |");


    }
}


