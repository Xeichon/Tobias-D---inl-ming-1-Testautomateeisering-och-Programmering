import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    private static final Map<String, String> morseToEnglish = new HashMap<>();
    private static final Map<String, String> englishToMorse = new HashMap<>();

    static {
        morseToEnglish.put(".-", "A");
        morseToEnglish.put("-...", "B");
        // Fyll i resten av bokstäverna och siffrorna...

        for (Map.Entry<String, String> entry : morseToEnglish.entrySet()) {
            englishToMorse.put(entry.getValue(), entry.getKey());
        }
    }

    public static String morseToEnglish(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] morseWords = morseCode.split(" ");
        for (String morseWord : morseWords) {
            result.append(morseToEnglish.getOrDefault(morseWord, ""));
        }
        return result.toString().trim();
    }

    public static String englishToMorse(String englishText) {
        StringBuilder result = new StringBuilder();
        char[] characters = englishText.toUpperCase().toCharArray();
        for (char character : characters) {
            if (character == ' ') {
                result.append(" ");
            } else {
                result.append(englishToMorse.getOrDefault(String.valueOf(character), "")).append(" ");
            }
        }
        return result.toString().trim();
    }
}