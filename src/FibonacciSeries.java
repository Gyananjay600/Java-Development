//Task 2: Fibonacci Sequence
//        Problem Statement:
//        Write a Java program to generate the Fibonacci sequence up to a specified number.
//
//        Steps to Complete:
//
//        1.Define a method to calculate the Fibonacci sequence.
//        2.Prompt the user for the upper limit.
//        3.Print the Fibonacci numbers up to that limit.

import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int N){
        int n1 = 0, n2 = 1, n3;
        for (int i = 0;i <= N; i++){
            System.out.print(n1+" ");
            // swap
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit for the fibonacci sequence:");
        int N = sc.nextInt();
        fibonacci(N);
    }
}
