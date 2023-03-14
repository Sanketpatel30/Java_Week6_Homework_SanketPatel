package HomeworkWeek6;
/* Write a Java programme using the following steps.
3.1Declare one instance and one static variable.
3.2Declare one instance method.
3.3Declare one static method.
3.4Call both instance and static variables into both instance and static methods inside the print statement.
3.5Declare the Main method.
3.6Call both instance and static methods into the Main method and run the programme.*/

public class Project3 {

    int a = 50; // Instance variable
    static String name = "Sanket"; // Static variable


    public void Test1() {
        System.out.println(a);
        System.out.println(Project3.name);
    }

    public static void Test2() { //static method
        Project3 f = new Project3();
        System.out.println(f.a);
        System.out.println(name);
    }

    public static void main(String[] args) {  //main method
        Project3 f = new Project3();
        f.Test1();
        Test2();
    }

}
