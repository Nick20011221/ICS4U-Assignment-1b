import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * This program calculates the longest run of a string.
 * 
 * @author Nick P-A
 * @since 2020/4/19
 * @version 1.0
 */
 

public class Longestrun {

  static String userString;

  /**
  * This gets the users input.
  */


  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println("enter a string to find the longest run: ");
    userString = userInput.nextLine();
    System.out.println(maxRun(userString));
  }


  /**
  * This calculates the longest run of a string.
  */


  public static int maxRun(String testString) {
    int length = testString.length();
    String substr = "";
    for (int i = 0; i < length;) {
      char current = testString.charAt(i);
      String tempSubstr = "" + current;
      while ((i + 1) < length && (current == testString.charAt(i + 1))) {
        tempSubstr = tempSubstr + testString.charAt(++i);
      }

      if (tempSubstr.length() >= substr.length()) {
        substr = tempSubstr;
      }
      i += 1;
    }
    System.out.println(substr);
    return substr.length();
  }
}