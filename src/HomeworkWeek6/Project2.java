package HomeworkWeek6;

//Write a Java programme using the following steps.
//      2.1 Declare two static variables
//      2.2 Declare one static method
//      2.3 Call both static variables into the static method inside the print statement.
//      2.4 Declare the Main method.
//      2.5 Call the static method into the Main method and Run the programme


public class Project2 {

    static String FirstName = "Sanket"; // static variables
    static String SurName = "Patel";    // static variables

    public static void main(String[] args) {
        Project2 f = new Project2();
        Test2();
    }

    public static void Test1(String[] args) {
        System.out.println(Project2.FirstName);
        System.out.println(Project2.SurName);
    }

    public static void Test2() {  //static method
        Project2 f = new Project2();
        System.out.println(FirstName);
        System.out.println(SurName);
    }

}

