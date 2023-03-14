package HomeworkWeek6;
//Write a program to calculate the area of a triangle


public class Project8 {
    //Function to calculate the area of the triangle
    static double area(double x, double y) {
        //Function returning the value of area of a triangle
        return (x * y) / 2;
    }

    // Main driver code
    public static void main(String[] args) {
        // Custom inputs - height and base values

        // Height of the triangle
        double x = 12;

        // Base of triangle
        double y = 6;

        //Calling area function and printing value corresponding area
        System.out.println("Area of the triangle: " + area(x, y));
    }
}

