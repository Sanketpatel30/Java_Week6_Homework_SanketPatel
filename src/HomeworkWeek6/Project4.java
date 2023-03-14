package HomeworkWeek6;

/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/

public class Project4 {


    int a = 30; // instance variable
    int b = 40; // instance variable
    static String Firstname = "Virat"; // static variable
    static String Surname = "Kohli"; // static variable

    public static void main(String[] args) {
        Project4 V = new Project4();
        V.Test1();
        Test2();
    }
    public void Test1() { // Instance method
        System.out.println(a);
        System.out.println(b);
        System.out.println(Project4.Firstname);
        System.out.println(Project4.Surname);
    }
    public static void Test2() { // static method
        Project4 V = new Project4();
        System.out.println(V.a);
        System.out.println(V.b);
        System.out.println(Firstname);
        System.out.println(Surname);
    }
}