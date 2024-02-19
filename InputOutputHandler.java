import java.util.Scanner;

public class InputOutputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till MorseCodeConverter!");
        System.out.println("1. Översätt morsekod till engelska");
        System.out.println("2. Översätt engelska till morsekod");
        System.out.print("Välj alternativ (1 eller 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Ange morsekod: ");
            String morseCode = scanner.nextLine();
            String englishText = MorseCodeConverter.morseToEnglish(morseCode);
            System.out.println("Engelsk text: " + englishText);
        } else if (choice == 2) {
            System.out.print("Ange engelsk text: ");
            String englishText = scanner.nextLine();
            String morseCode = MorseCodeConverter.englishToMorse(englishText);
            System.out.println("Morsekod: " + morseCode);
        } else {
            System.out.println("Ogiltigt val. Avslutar programmet.");
        }

        scanner.close();
    }
}