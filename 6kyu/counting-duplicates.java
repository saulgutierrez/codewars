// Description
/**
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 
 * Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
*/

// My solution
import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Convertir la cadena a minúsculas para ignorar mayúsculas/minúsculas
        String lowerText = text.toLowerCase();
        // Mapa para contar las apariciones de cada carácter
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Contar las apariciones de cada carácter
        for (char c : lowerText.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Contar cuántos caracteres tienen más de una aparición
        int duplicates = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicates++;
            }
        }
        
        return duplicates;
    }
    
    public static void main(String[] args) {
        int duplicates = duplicateCount("Indivisibilities");
        System.out.println(duplicates);
    }
}
