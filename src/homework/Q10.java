package homework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fnum, snum, ans;
        char sign; // this assinge char variable *-/+
        System.out.println("Enter your first digit");
        fnum = input.nextInt();
        System.out.println("Enterbyour second digit");
        snum = input.nextInt();
        System.out.println("Enter mathmatcal operator");
        sign = input.next().charAt(0);
        if (sign == '+') ;
        {
            ans = fnum + snum;
            System.out.println(fnum + " " + sign + " " + snum + "=" + " " + ans);

        }  if (sign == '-') {
            System.out.println(fnum + " " + sign + " " + snum + "=" + " " + ans);
        }
        else if(sign =='*'){
            ans =fnum*snum;
            System.out.println(fnum + " " + sign + " " + snum + "=" + " " + ans);
        } else if (sign == '/'){
            ans = fnum/snum;
            System.out.println(fnum + " " + sign + " " + snum + "=" + " " + ans);
        }
    }
}