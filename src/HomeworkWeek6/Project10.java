package HomeworkWeek6;
/*Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
        Test Data: Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/

import java.util.Scanner;

public class Project10 {

    static int b = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which timestables would you like?: ");
        int a = scanner.nextInt();
        int c = a * b;
        int d = a * (b + 1), e = a * (b + 2), f = a * (b + 3), g = a * (b + 4), h = a * (b + 5), i = a * (b + 6), j = a * (b + 7), k = a * (b + 8), l = a * (b + 9);

        System.out.println(a + " x 1" + " = " + c);
        System.out.println(a + " x 2" + " = " + d);
        System.out.println(a + " x 3" + " = " + e);
        System.out.println(a + " x 4" + " = " + f);
        System.out.println(a + " x 5" + " = " + g);
        System.out.println(a + " x 6" + " = " + h);
        System.out.println(a + " x 7" + " = " + i);
        System.out.println(a + " x 8" + " = " + j);
        System.out.println(a + " x 9" + " = " + k);
        System.out.println(a + " x 10" + " = " + l);
        scanner.close();
    }

}
