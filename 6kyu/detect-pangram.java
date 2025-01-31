// Description
/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram.
 * Return True if it is, False if not.
 * Ignore numbers and punctuation.
 */

// My solution
import java.util.Arrays;

public class PangramChecker {
  static int ALPHABET_COUNT = 26;
  public boolean check(String str) {
    if (str == null) {
        return false;
    }
    // Build an empty boolean array for checking all letters
    Boolean[] alphabetMarker = new Boolean[ALPHABET_COUNT];
    Arrays.fill(alphabetMarker, false);
    int alphabetIndex = 0;
    str = str.toUpperCase();
    // Checking if each letter in string is between A and Z, fill in their
    // corresponding index, and mark this index as filled (true)
    for (int i = 0; i < str.length(); i++) {
        if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
            alphabetIndex = str.charAt(i) - 'A';
            alphabetMarker[alphabetIndex] = true;
        }
    }
    // Check if all index are filled
    for (boolean index : alphabetMarker) {
        if (!index) {
            return false;
        }
    }
    return true;
  }
}