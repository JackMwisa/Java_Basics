package Day7;
import java.io.BufferedReader;
import java.io.FileReader;

public class LetterCounter {
    public static void main(String[] args) {
        String fileName = "Huseyin.txt";
        char letter = 'e'; // Change this to the letter you want to count
        int count = countLetter(fileName, letter);
        System.out.println("The letter '" + letter + "' appears " + count + " times in the file.");
    }

    public static int countLetter(String fileName, char letter) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (c == letter) {
                    count++;
                }
            }
        } catch (Exception e) {
            // No exception handling
        }
        return count;
    }
}
