//Task 3: Factorial Calculation
//        Problem Statement:
//        Create a Java program that calculates the factorial of a number provided by the user.
//
//        Steps to Complete:
//
//       1. Write a method to calculate factorial using recursion.
//       2. Take user input for the number.
//       3. Display the calculated factorial.

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNumber {

public static BigInteger Factorial(int n){
    //using BigInteger for any large number
    BigInteger f = BigInteger.ONE;
    for (int i =1; i<= n; i++){
        f = f.multiply(BigInteger.valueOf(i));
    }
    return f;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Factorial is not defined!");
        }
        else{
            System.out.println("Factorial of"+" "+ n +" = "+Factorial(n));
        }

    }
}
