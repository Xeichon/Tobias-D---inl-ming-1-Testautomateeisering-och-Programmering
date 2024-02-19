import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeConverterTest {
    @Test
    public void testMorseToEnglish() {
        String morseCode = "-- --- .-. ... . / - .... . / -.-. --- -..";
        String expectedResult = "MORSE TO CODE";
        String actualResult = MorseCodeConverter.morseToEnglish(morseCode);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEnglishToMorse() {
        String englishText = "HELLO WORLD";
        String expectedResult = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";
        String actualResult = MorseCodeConverter.englishToMorse(englishText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInvalidMorseCharacter() {
        String morseCode = "-.. .. ...- .-.-"; // Invalid Morse code
        String expectedResult = "";
        String actualResult = MorseCodeConverter.morseToEnglish(morseCode);
        assertEquals(expectedResult, actualResult);
    }
}