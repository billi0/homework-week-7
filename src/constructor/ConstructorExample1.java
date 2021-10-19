package constructor;

public class ConstructorExample1{
   // this is constructor
  public ConstructorExample1() {  // constructor allways start with class name
      System.out.println("i am a constructor");
  }

  //this is 1 arguments constructor
  public ConstructorExample1(int a){
      System.out.println("i am one args constructor");
  }


   // with one  argumets with diffrent data type
  public ConstructorExample1(String name){

  }
  public ConstructorExample1(int a, int b){
      System.out.println("i am two const");
  }



  public void myMethod(){
      System.out.println("i am method");
  }






    public static void main(String[] args) {

   ConstructorExample1 obj = new ConstructorExample1(); //i am a constructor
        ConstructorExample1 obj1 =new ConstructorExample1(10); //i am one arg construtor
        ConstructorExample1 onj2 = new ConstructorExample1(10,20);// i am two arg constructor
                obj.myMethod(); //i am a method
            }
        }





