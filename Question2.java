//Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square root of a number, etc.

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {

    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();

    boolean isNotPrime = false;

    for (int i = 2; i < a; i++) {
       if (a % i == 0) {
         isNotPrime = true;
         break;
       }
    }

    if (isNotPrime == true) {
      System.out.println(a + " is not Prime");
    } else {
      System.out.println(a + " is Prime");
    }

  }
}
