/**
 * If you can't sleep, just count sheep!!
 * Task:
 * Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
 */

// My solution:
class Kata {
  public static String countingSheep(int num) {
    //Add your code here
    String sheep = "";
    if (num == 0) {
      return sheep;
    } else {
      for (int i = 1; i <= num; i++) {
        sheep += i + " sheep...";
      }
    }
    return sheep;
  }
}