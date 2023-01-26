// Description:
// Simple, remove the spaces from the string, then return the resultant string.

// My solution:
public class Kata {
    public static String noSpace(final String x) {
      String str;
      str = x.replaceAll("\\s", "");
        return str;
    }
}