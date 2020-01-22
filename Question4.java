//This is generally asked as follow-up or alternative of the previous program. This time you need to check if given Integer is palindrome or not. An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.

import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Number for palindrome?");
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
