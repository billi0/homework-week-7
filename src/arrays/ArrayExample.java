package arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // int a = 1=, int b = 20, int c=30, int d=40, int e=50
        // only samr tpe data not mix like int and string etc.
       // int [] a;
        int b [];

        // approach 1
        int d[] = {10,20,30,40,50}; //there is no size

        //approach 2
        int [ ] a  = new int [10];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        System.out.println(a[0]); //20
        System.out.println(a[1]); //50
        System.out.println(a[2]); //50
        System.out.println(a[3]); //50
        System.out.println(a[4]); //50

        for(int i=0; i<5; i++){
            System.out.println(a[i]); //10,  20, 30, 40,50
        }
    }
}
