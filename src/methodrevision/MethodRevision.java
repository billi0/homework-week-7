package methodrevision;

public class MethodRevision {


    public static void main(String[] args) {
// static area
        MethodRevision me = new MethodRevision();
        me.additionCalculation();
        me.substration(20,10);
        me.substration(50,35); //with parameter you can add multivalue in main method.
        me.myAddition();//5,10
        int value =me.myAddition();
        System.out.println(value); //5,10,15
        //System.out.println((me.myAddition())); // 5,10,15
        String name =myName("prime");
        System.out.println(name);
        System.out.println(myName("prime"));

    }




    //1. no return type,(void word will be use) , no perameter/arguments
    // instance method , instance related to obj

     public void additionCalculation(){
        // public int additioncalculator ( is return type)
         // retunr (a+b) return type result.
        // local variable
    int a=10;
    int b=20;
         System.out.println(a+b);
    }

    // 2. no retunr type ( void ) with parameter (args)

    public void substration( int a, int b){ // with para meter u dont add value in sout or int type inside method.
        System.out.println(a-b);

    }
    //3. with return type (data) ,no parameter
    // instance method
    public int myAddition(){
        int a=5;
        int b=10;
        System.out.println("Fist value:" +a);
        System.out.println("second value:" +b);
        return a+b;


    }

    // 3. with return type (data) , with parameter
    private static String myName( String name){
        return name;


    }










}
