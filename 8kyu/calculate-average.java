/* Description: 
Write a function which calculates the average of the numbers in a given list.
Note: Empty arrays should return 0. */

// My solution:
public class Kata{
  public static double find_average(int[] array){
    double average, sum = 0.0;
    for(int i = 0; i < array.length; i++) {
      if(array.length == 0) {
        return 0;
      }
      sum += array[i];
    }
    average = sum / array.length;
    return average;
  }
}