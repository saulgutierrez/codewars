/**
 * Description:
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 */
// My solution:
public class Kata {
  public static int[] invert(int[] array) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] > 0) {
        array[i] = -Math.abs(array[i]);
      } else {
        array[i] = Math.abs(array[i]);
      }
    }
    return array;
  }
}