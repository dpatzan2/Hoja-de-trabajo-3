
package uvg.edu.gt.archivo;

import java.io.*;

public class DataFileHandler {
    public static void writeToFile(String fileName, int[] data) {
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
            return convertStringArrayToIntArray(values);
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }

    private static int[] convertStringArrayToIntArray(String[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = Integer.parseInt(values[i]);
        }
        return result;
    }
}
