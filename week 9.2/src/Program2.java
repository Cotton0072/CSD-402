import java.io.*;
import java.util.Random;

public class Program2 {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random rand = new Random();

        try {
            // FileWriter with append = true
            FileWriter writer = new FileWriter(file, true);

            // Write or append 10 random numbers
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); // 0–99
                writer.write(number + " ");
            }

            writer.close();
            System.out.println("Numbers written/appended to data.file.");

            // Now read the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("\nContents of data.file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
        }
    }
}
