
package uvg.edu.gt.model;

import java.io.*;
import java.util.Arrays;

public class FileManager {
    public static void writeToFile(String fileName, Integer[] data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int value : data) {
                writer.print(value);
                writer.print(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int[] readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String[] values = reader.readLine().split(",");
            return Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }

}
