package HomeworkWeek6;
//Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

import java.util.Scanner;

public class Project18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Addition of two numbers: " + num1 + " + " + num2 + " = " +
                (num1 + num2));
        System.out.println("subtraction of two numbers: " + num1 + " - " + num2 + " = " +
                (num1 - num2));
        System.out.println("Multiplication of two numbers: " + num1 + " x " + num2 + " = " +
                (num1 * num2));
        System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = " +
                (num1 / num2));
        System.out.println("Remainder of two numbers: " + num1 + " mod " + num2 + " = " +
                (num1 % num2));
        scanner.close();
    }
}
