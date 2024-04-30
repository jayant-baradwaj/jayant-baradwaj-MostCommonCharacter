import java.util.Map;
import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0)+1);
        }

        char maxChar = ' ';
        int maxCount = -1;
        for(char letter : charCount.keySet())
        {
            if(charCount.get(letter) > maxCount)
            {
                maxCount = charCount.get(letter);
                maxChar = letter;
            }
        }

        return maxChar;
    }
}
