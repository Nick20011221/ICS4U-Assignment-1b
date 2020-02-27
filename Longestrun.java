import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
/**
 * This program calculates the longest run of a string.
 * 
 * @author Nick P-A
 * @since 2020/2/13 feb 25 2020
 * @version 1.0
 */
 

public class Longestrun {
  static int maxcount = 0;
  
  /**
  * This class gets the string from the user and prints the answer.
  */
  
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String string = scanner.next();
    
    if (string != null) {
      String strout = longestrun(string);
      System.out.println("longest run is : " + maxcount);
    
    } else {
      System.out.println("Input string is empty");
    }
    scanner.close();
  }
  
  
  /**
  * This class calculates the longest run of a string.
  */
  
  public static String longestrun(String string) {
    int pos = 0;
    int maxpos = string.length();
    char thiselem;
    char lastelem;
    String strout = "";
    int count = 1;
    
    lastelem = string.charAt(pos);
    for (pos = 1; pos < maxpos; pos++) {
      thiselem = string.charAt(pos);
      if (lastelem == thiselem) {
        count++; 
        
      } else {
        if (count > maxcount) {
          maxcount = count;
        }
        count = 1;
      }
      lastelem = thiselem;
    }
    if (count > maxcount) {
      maxcount = count;
    }
    String test = "";
    return test;
  }
}
