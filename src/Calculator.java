//Task 1: Simple Calculator
//Problem Statement:
//Develop a simple calculator that performs addition, subtraction, multiplication, and division.
//
//Steps to Complete:
//
//1.Create a new Java class for the calculator.
//2.Implement methods for each arithmetic operation.
//3.Use the Scanner class to take user input.
//4.Display the results for each operation.

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b){
        return a + b;
    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double division(double a, double b){
        if (b == 0) {
            System.out.println("Can't divide by zero.");
            return 0;
        }
       return a / b;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double a = sc.nextDouble();
        System.out.print("Enter the second number:");
        double b = sc.nextDouble();

        System.out.println("Addition is:"+ add(a,b));
        System.out.println("Subtraction is:"+ sub(a,b));
        System.out.println("Multiplication is:"+multiply(a,b));
        System.out.print("Division is:"+division(a,b));
    }
}
