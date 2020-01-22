//You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."  Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.

import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Word for palindrome?");
    String pali = in.nextLine();

    boolean isPalindrome = true;

    for (int i = 0; i < pali.length()/2; i++) {
      if (pali.charAt(i) != pali.charAt(pali.length() - i - 1)) {
        isPalindrome = false;
      }
    }

    if (isPalindrome == true) {
      System.out.println(pali + " is a palindrome");
    } else {
      System.out.println(pali + " is not a palindrome");
    }

  }
}
