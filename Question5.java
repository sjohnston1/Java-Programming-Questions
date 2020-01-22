//A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong number or not.

import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a number to detect if it is an armstrong number: ");
    int numb = in.nextInt();

    ArrayList<Integer> values = new ArrayList<Integer>();
    ArrayList<Integer> finalValues = new ArrayList<Integer>();

    int test = numb;

    while (test > 0) {
      values.add(test % 10);
      test = test / 10;
    }

    for (int i = 0; i < values.size(); i++) {
      finalValues.add(values.get(i) * values.get(i) * values.get(i));
    }

    int final2 = 0;

    for (int i = 0; i < finalValues.size(); i++) {
      final2 = finalValues.get(i) + final2;
    }

    if (final2 == numb) {
      System.out.println(numb + " is an armstrong number");
    } else {
      System.out.println(numb + " is not an armstrong number");
    }

  }
}
