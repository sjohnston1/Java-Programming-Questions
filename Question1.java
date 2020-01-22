//Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    int a = 1;
    int b = 1;

    System.out.println("Please put in the amount of values you want calculated: ");
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();

    System.out.println(a);
    System.out.println(b);

    for (int i = 0; i < amount - 2; i++) {
      System.out.println(a + b);
      int c = a + b;
      a = b;
      b = c;
    }

  }
}
