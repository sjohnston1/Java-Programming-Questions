//prime using sqrt of numb
import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = in.nextInt();

    int square = (int) Math.sqrt(num);

    boolean isPrime = true;

    for (int i = 2; i <= square; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime == true) {
      System.out.println(num + " is prime!");
    } else {
      System.out.println(num + " is not prime!");
    }

  }
}
