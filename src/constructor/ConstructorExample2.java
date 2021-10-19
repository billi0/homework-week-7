package constructor;

public class ConstructorExample2 {
    //the cronstructor is use to assing value to the  instance variable
    int empID;
    String name;

    public ConstructorExample2(int empID, String name){
        this.empID=empID; //
        this.name=name;

    }

    public static void main(String[] args) {
        ConstructorExample2 obj= new ConstructorExample2(10, "prime");
        obj.myMethod();
    }

    public void myMethod (){
        System.out.println(empID); // 10
        System.out.println(name); //prime
    }

}
