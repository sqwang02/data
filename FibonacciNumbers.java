package com.sqwang.test;

public class FibonacciNumbers {

    public static void main(String[] args) {
        int n = 10; // Change n to generate Fibonacci sequence up to nth term
        fibonacciSequence(n);
    }

    public static void fibonacciSequence(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. n must be a positive integer.");
            return; // Unreachable path (n <= 0)
        }

        if (n == 1) {
            System.out.println("Fibonacci sequence up to " + n + " term:");
            System.out.println(0);
            return; // Path 1: n == 1
        }

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        
        // Path 2: n == 2
        if (n == 2) {
            return;
        }

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println(); // Path 3: n > 2
    }
}
