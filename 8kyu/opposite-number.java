// Description:
// Very simple, given an integer or a floating-point number, find its opposite.

// My solution:
public class Kata
    {
        public static int opposite(int number)
        {
            // your code here
          if(number < 0) {
            // -14
            // Convert to positive
            number = number - number - number;
          } else {
            // 14
            // Convert to negative
            number = number - number - number;
          }
          return number;
        }
    }