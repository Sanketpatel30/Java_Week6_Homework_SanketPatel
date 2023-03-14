package HomeworkWeek6;
/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
*/

public class Project5 {

    public static void main(String[] args) {

        Project5 S = new Project5(); // object p creation

        addition(10, 20); //30
        subtraction(90, 40); //50
        S.multiplication(10, 50); //4
        S.division(200, 50); //4

    }

    // N0 return type, with parameters
    public static void addition(int a, int b) { // static method
        System.out.println("Addition of a and b is = " + (a + b));
    }

    public static void subtraction(int a, int b) { // static method
        System.out.println("Subtraction of a and b is = " + (a - b));
    }

    public void multiplication(int a, int b) { // Instance method
        System.out.println("Multiplication of a and b is = " + (a * b));
    }

    public void division(int a, int b) { // Instance method
        System.out.println("Addition of a and b is = " + (a / b));
    }

}