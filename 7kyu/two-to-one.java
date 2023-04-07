// Description:
/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 */
// My solution:
import java.util.Arrays;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
    
      // Sorting
      String str = s1 + s2;
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      
      // Taking only once letter
      char prev = 0;
      int k = 0;
      // Comparing one by one and store each different digit
      // respect his previous check
      for (char c: chars) {
        if (prev != c) {
          chars[k++] = c;
          prev = c;
        }
      }
    return new String(chars).substring(0, k);
    }
}