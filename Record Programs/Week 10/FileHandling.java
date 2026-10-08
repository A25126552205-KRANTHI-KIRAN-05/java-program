package labprograms;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static int countPattern(String text, String pattern) {

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }

    public static void main(String[] args) {

        String text =
                "Peter Piper picked a peck of pickled peppers\n" +
                "A peck of pickled peppers Peter Piper picked\n" +
                "If Peter Piper picked a peck of pickled peppers\n" +
                "Where’s the peck of pickled peppers Peter Piper picked?";

        File file = new File("sample.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            FileReader reader = new FileReader(file);
            Scanner sc = new Scanner(reader);

            StringBuilder content = new StringBuilder();

            while (sc.hasNextLine()) {
                content.append(sc.nextLine()).append("\n");
            }

            sc.close();
            reader.close();

            String data = content.toString().toLowerCase();

            int peCount = countPattern(data, "pe");
            int piCount = countPattern(data, "pi");

            System.out.println("'pe' - no of occurrences - " + peCount);
            System.out.println("'pi' - no of occurrences - " + piCount);

        } catch (IOException e) {
            System.out.println("Error while handling the file.");
        }
    }
}