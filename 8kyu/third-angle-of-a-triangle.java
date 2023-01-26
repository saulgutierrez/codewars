// Description:
// You are given two interior angles (in degrees) of a triangle.
// Write a function to return the 3rd.
// Note: only positive integers will be tested.
// https://en.wikipedia.org/wiki/Triangle

// My solution:
public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
      int total = 180;
      int angleSum = angle1 + angle2;
      int angle3 = total - angleSum;
      return angle3;
    }
}