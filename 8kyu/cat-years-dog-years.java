/**
 * Description:
 * I have a cat and a dog.
 * I got them at the same time as kitten/puppy. That was humanYears years ago.
 * Return their respective ages now as [humanYears,catYears,dogYears]
 * NOTES:
 * humanYears >= 1
 * humanYears are whole numbers only
 * Cat Years
 * 15 cat years for first year
 * +9 cat years for second year
 * +4 cat years for each year after that
 * Dog Years
 * 15 dog years for first year
 * +9 dog years for second year
 * +5 dog years for each year after that
 */

// My solution
public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    // Your code here!
    int dogYears = 0, catYears = 0;
    
    for(int i = 0; i < humanYears; i++) {
      if (humanYears == 1) {
        dogYears = 15;
        catYears = 15;
      } else if (humanYears == 2) {
        dogYears = 24;
        catYears = 24;
      } else {
        dogYears = 24 + ((humanYears - 2) * 5);
        catYears = 24 + ((humanYears - 2) * 4);
      }
    }
    int[] years = new int[3];
    years[0] = humanYears;
    years[1] = catYears;
    years[2] = dogYears;
    return years;
  }

}