// Description
/**
 * Story
 * Ben has a very simple idea to make some profit: he buys something and sells it again. Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price. Instead, he's going to buy it for the lowest possible price and sell it at the highest.
 * Task
 * Write a function that returns both the minimum and maximum number of the given list/array.
 */

// My solution
class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i];
        }
        
        if (arr[i] > max) {
          max = arr[i];
        }
      }
      int[] newArr = new int[2];
      newArr[0] = min;
      newArr[1] = max;
      
      return newArr;
    }
}