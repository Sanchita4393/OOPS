package experiments;
import java.io.*;

public class fle_handling {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, File Handling in Java!");
            writer.close();

            // Reading from a file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
