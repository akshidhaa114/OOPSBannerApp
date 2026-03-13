import java.util.HashMap;
import java.util.Map;

public class OopsBannerAppUC8 {

    // Build the map: Character -> pattern (array of rows)
    private static Map<Character, String[]> buildCharacterPatternMap() {
        Map<Character, String[]> charMap = new HashMap<>();

        // 7x7 style patterns; adjust to match your expected output
        String[] O_PATTERN = {
            " ***  ",
            "*   * ",
            "*   * ",
            "*   * ",
            "*   * ",
            "*   * ",
            " ***  "
        };

        String[] P_PATTERN = {
            "****  ",
            "*   * ",
            "*   * ",
            "****  ",
            "*     ",
            "*     ",
            "*     "
        };

        String[] S_PATTERN = {
            " **** ",
            "*     ",
            "*     ",
            " ***  ",
            "    * ",
            "    * ",
            "****  "
        };

        charMap.put('O', O_PATTERN);
        charMap.put('P', P_PATTERN);
        charMap.put('S', S_PATTERN);

        return charMap;
    }

    // Render a word like "OOPS" using the map
    private static void printBannerWord(String word, Map<Character, String[]> charMap) {
        word = word.toUpperCase();

        // Assume all patterns have same height
        int rows = charMap.get('O')[0].length();  // wrong! fix: use array length
    }
}