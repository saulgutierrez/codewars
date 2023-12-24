
/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
 * Example: (Input --> Output)
 * "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
 */

// My solution
import java.io.*;
import java.util.*;

public class isogram {
    public static boolean  isIsogram(String str) {
      // Convert the string in lower case letters
        str = str.toLowerCase();
        int len = str.length();
      
        char arr[] = str.toCharArray();
        // Sorting the array by ascending ASCII
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            // If some letter is equal to the next means is not isogram
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    } 
}