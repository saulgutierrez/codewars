/*
Description:
Complete the square sum function so that it squares each number passed into it and then sums the results together.
For example, for [1, 2, 2] it should return 9.
My solution:
*/
public class Kata {
  public static int squareSum(int[] n) {
    int result = 0;
    for(int i = 0; i < n.length; i++) {
      n[i] = n[i] * n[i];
    }
    
    for(int i = 0; i < n.length; i++) {
      result += n[i];
    }
    return result;
  }
 }