package HomeworkWeek6;
//Write a Java program to convert a decimal number to binary number.
//Input Data:
// Input a Decimal Number : 5
//Expected Output
//Binary number is: 101

import java.util.Scanner;

public class Project17 {
    public static void main(String args[]) {

        int dec_num, quote, i = 1, j;
        int bin_num[] = new int[100];

        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        quote = dec_num;

        while (quote != 0) {
            bin_num[i++] = quote % 2;
            quote = quote / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        scan.close();
    }
}
