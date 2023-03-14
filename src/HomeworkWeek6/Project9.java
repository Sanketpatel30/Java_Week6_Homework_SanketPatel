package HomeworkWeek6;
//Write a program to convert the upper case to lower case

import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String userInputString = scanner.nextLine();

        //print uppercase string
       // System.out.println("Uppercase string " + userInputString.toLowerCase());

        //print lowercase string
        System.out.println("Lowercase string " + userInputString.toLowerCase());
        scanner.close();
    }
}
