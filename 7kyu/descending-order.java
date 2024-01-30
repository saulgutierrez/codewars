// Description
/**
 * Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * Examples:
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */

// My solution
public class DescendingOrder {
    public static int sortDesc(final int num) {
      
        String temp = Integer.toString(num);
        int[] newGuess = new int[temp.length() + 1];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        
        newGuess = quicksort(newGuess, 0, temp.length());
        
        int res = 0;
        for(int i = 0; i < newGuess.length - 1; i++) {
             res = res * 10 + newGuess[i];
        }
        
        return res;
    }
  
    public static int[] quicksort(int array[], int low, int high) {
        if (low >= high)
		        return array;
	
        int mid = (low + high) / 2;
        int pivot = array[mid];
        int i = low;
        int j = high;
        int temp;
    	
        while (i <= j) 
        {
          while (pivot < array[i])
            i++;

          while (pivot > array[j])
            j--;

          if (i <= j)
          {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
          }
        }

        // Calling QuickSort for the first sub list
        if (low < j)
          // Callng recursive function
          quicksort(array, low, j);

        // Calling QuickSort for the second sub list
        if (i < high)
          // Calling recursive function
          quicksort(array, i, high);

        return array;
    }
}