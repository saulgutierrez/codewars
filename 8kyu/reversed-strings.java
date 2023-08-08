/**
 * Complete the solution so that it reverses the string passed into it.
 */

// My solution:
public class Kata {

  public static String solution(String str) {
    // Your code here...
    StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
  }

}