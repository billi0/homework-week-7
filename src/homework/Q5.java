package homework;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */

import java.util.Scanner;

class Q5 {
    public static void main(String args[]) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name= obj1.nextLine();
        System.out.println("enter employee id");
        int id= obj1.nextInt();
        double basic, da, hra, ta, pf, gross;
        System.out.println("Enter Basic salary of the employee\n");
obj1.close();
        basic = obj1.nextDouble();
        da = 8 * basic / 100;
        hra = 10 * basic / 100;
        ta = 9 * basic / 100;
        pf = 20 * basic / 100;
        gross = basic + da + hra + ta + pf;
        System.out.println("The D.A of the basic salary of the employee is:" + da);
        System.out.println("The H.R.A of the basic salary of the employee is:" + hra);
        System.out.println("The T.A of the basic salary of the employee is:" + ta);
        System.out.println("The p.f of the basic salary of the employee is:" + pf);
        System.out.println("The Gross salary of the employee is:" + gross);

        System.out.println("|Salary slip ");
        System.out.println("|Employee Id " + id);
        System.out.println("|Employee name " + name);
        System.out.println("|basic " +basic);
        System.out.println("|DA (8%) :" +da);
        System.out.println("|HRA (10%): " +ta);
        System.out.println("|TA (9%) :" +pf);
        System.out.println("|PF : (20%) " +pf);
        System.out.println("|Gross salary:" +gross);
    }
}