/**
 * Build a function that returns an array of integers from n to 1 where n>0.
 * Example : n=5 --> [5,4,3,2,1]
 */

// My solution:
public class Sequence {
  public static int[] reverse(int n) {
    int arr[] = new int[n];
    int i = 0;
    while(n != 0) {
      arr[i] = n;
      n--;
      i++;
    }
    return arr;
  }
}