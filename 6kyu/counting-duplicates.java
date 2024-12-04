package countingduplicates;

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
