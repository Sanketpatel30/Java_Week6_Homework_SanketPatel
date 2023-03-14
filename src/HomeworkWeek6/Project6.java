package HomeworkWeek6;

/*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
*/

import java.util.Scanner;

public class Project6 {

    public static void main(String [] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle in cm :");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * radius * radius;
        System.out.println("Area of circle:" + area + "cm");
        input.close();
    }
}