// Description:
/* Create a function with two arguments that will return an array of the first n multiples of x.
Assume both the given number and the number of times to count will be positive numbers greater than 0.
Return the results as an array or list ( depending on language ). */

// My solution:

public class Kata{
  public static int[] countBy(int x, int n){
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = x * (i+1);
    }
    return arr;
  }
}