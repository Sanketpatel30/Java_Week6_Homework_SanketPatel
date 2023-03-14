package HomeworkWeek6;

//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C)

import java.util.Scanner;

public class Project7 {

    public static void main(String[] args) {
        float Fahrenheit, Celsius;
        Fahrenheit = 43;
        Celsius = ((Fahrenheit-32)*5)/9;
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature in Celsius is; "+Celsius);
        input.close();
    }

}
