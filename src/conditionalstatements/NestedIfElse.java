package conditionalstatements;

public class NestedIfElse { // multipule condition
    public static void main(String[] args) {
        int marks= 90;

        if (marks>=90){
            System.out.println("Grad A");
        }else if(marks <80 && marks >=70){
            System.out.println("Grad b");
        }else if(marks <70 && marks >=60){
            System.out.println("Grad c");
        }else{
            System.out.println("pass");
        }
    }
}
