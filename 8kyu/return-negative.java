// Description:
// In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

// My solution:
public class Kata {
  public static int makeNegative(final int x) {
    int negative;
    if(x < 0) {
      return x;
    } else if (x == 0) {
      return x;
    } else {
      return x-x-x;
    }
  }
}