package practice;

public class Challenge3 {
    int eld;
    int deptNo;
    String eName;
    String job;
    public void display(){
        System.out.println(eld);
        System.out.println(eName);
        System.out.println(deptNo);
        System.out.println(job);

    }

    public static void main(String[] args) {
        Challenge3 emp1= new Challenge3();
         emp1.eld=101;
         emp1.eName= "jhon";
         emp1.deptNo=10;
        emp1.job="Manual Testre";
        emp1.display();

        Challenge3 emp2=new Challenge3();
         emp2.eld=102;
        emp2.eName="Smith";
       emp2.deptNo=11;
         emp2.job="Automation Tester";
       emp2.display();
    }

}
