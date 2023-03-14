package HomeworkWeek6;

//Write a Java programme using the following steps.
//     1.1 Declare two instance variables.
//     1.2 Declare one instance method.
//     1.3 Call both instance variables into the instance method inside the print statement.
//     1.4 Declare the Main method.
//     1.5 Call the above instance method into the Main method and Run the programme


public class Project1 {
    int a = 10; // instance variables
    int b = 20; // instance variables

    public static void main(String[] args) {
        Project1 f = new Project1();
        f.Test1();

    }
       public void Test1(){ //Instance method
           System.out.println(a);
           System.out.println(b);
       }

       public void Test2(){ //Instance method
         Project1 f = new Project1();
         System.out.println(f.a);
         System.out.println(f.b);

       }

}
