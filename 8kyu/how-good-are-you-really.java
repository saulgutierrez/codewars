/* Description:
There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!
 */

 // My solution:
 public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    int average = 0;
    int sum = 0;
    boolean better;
    for (int i = 0; i < classPoints.length; i++) {
      sum += classPoints[i];
    }
    
    average = sum / classPoints.length;
    
    if(yourPoints < average) {
      better = false;
    } else {
      better = true;
    }
    
    return better;
  }
}