package Day8;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static void main(String[] args) {
        printLineNumbers("jack.txt");
    }

    public static void printLineNumbers(String fileName) {
        Path path = Paths.get(fileName);
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(path);
            // Create a new list to store the updated lines
            List<String> numberedLines = new ArrayList<>();
            // Add line numbers to each line
            for (int i = 0; i < lines.size(); i++) {
                numberedLines.add((i + 1) + "- " + lines.get(i));
            }
            // Write the updated lines back to the file
            Files.write(path, numberedLines);
            System.out.println("File updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
