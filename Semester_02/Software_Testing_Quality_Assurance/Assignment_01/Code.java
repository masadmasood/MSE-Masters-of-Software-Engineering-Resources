/* 
 * Muhammad Asad Masood
 * MSSE012515007 
 * 2nd Semester - Software Engineering
 * STQA Assignment - 1
 * Date: 14/03/2026
 * Java Program to implement the STQA Assignment 1
 * 
**/

public class STQAAssignment {

    public static void main(String[] args) {

        // Scenario 1 Test Cases
        System.out.println("Celsius to Fahrenheit Tests");
        convertCelsiusToFahrenheit(Double.NaN);
        convertCelsiusToFahrenheit(-300);
        convertCelsiusToFahrenheit(-273.15);
        convertCelsiusToFahrenheit(25);

        // Scenario 2 Test Cases
        System.out.println("\nArea Finder Tests");
        calculateArea("", 5, 0);
        calculateArea("circle", -2, 0);
        calculateArea("circle", 7, 0);
        calculateArea("triangle", -3, 5);
        calculateArea("triangle", 10, 4);
        calculateArea("rectangle", 0, 8);
        calculateArea("rectangle", 6, 3);
        calculateArea("square", -5, 0);
        calculateArea("square", 9, 0);
        calculateArea("pentagon", 5, 6);

        // Scenario 3 Test Cases
        System.out.println("\nRight Triangle Tests");
        calculateRightTriangle(Double.NaN, 4);
        calculateRightTriangle(0, 4);
        calculateRightTriangle(5, 5);
        calculateRightTriangle(3, 4);
    }

    // Scenario 1
    public static void convertCelsiusToFahrenheit(double c) {

        if (!Double.isFinite(c)) {
            System.out.println("Invalid input: temperature must be finite");
            return;
        }

        if (c < -273.15) {
            System.out.println("Invalid: below absolute zero");
            return;
        }

        double f = (c * 9 / 5) + 32;

        System.out.println("Celsius = " + c + " Fahrenheit = " + f);
    }

    // Scenario 2
    public static void calculateArea(String shape, double a, double b) {

        if (shape == null || shape.trim().isEmpty()) {
            System.out.println("Shape missing");
            return;
        }

        shape = shape.toLowerCase();

        if (shape.equals("circle")) {

            if (a <= 0) {
                System.out.println("Invalid circle radius");
                return;
            }

            double area = Math.PI * a * a;
            System.out.println("Circle Area = " + area);
        }

        else if (shape.equals("triangle")) {

            if (a <= 0 || b <= 0) {
                System.out.println("Invalid triangle dimensions");
                return;
            }

            double area = 0.5 * a * b;
            System.out.println("Triangle Area = " + area);
        }

        else if (shape.equals("rectangle")) {

            if (a <= 0 || b <= 0) {
                System.out.println("Invalid rectangle dimensions");
                return;
            }

            double area = a * b;
            System.out.println("Rectangle Area = " + area);
        }

        else if (shape.equals("square")) {

            if (a <= 0) {
                System.out.println("Invalid square side");
                return;
            }

            double area = a * a;
            System.out.println("Square Area = " + area);
        }

        else {
            System.out.println("Unsupported shape");
        }
    }

    // Scenario 3
    public static void calculateRightTriangle(double a, double b) {

        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            System.out.println("Invalid input");
            return;
        }

        if (a <= 0 || b <= 0) {
            System.out.println("Leg must be greater than zero");
            return;
        }

        double hyp = Math.sqrt(a * a + b * b);
        double area = 0.5 * a * b;
        double perimeter = a + b + hyp;

        System.out.println("Hypotenuse = " + hyp);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}